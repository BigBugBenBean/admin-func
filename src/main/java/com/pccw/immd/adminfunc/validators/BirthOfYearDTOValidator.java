package com.pccw.immd.adminfunc.validators;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.SmartValidator;



import com.pccw.immd.commons.util.VLDException;
import com.pccw.immd.adminfunc.dto.BirthOfDateDTO;
import com.pccw.immd.adminfunc.dto.BirthOfYearDTO;


@Component
public class BirthOfYearDTOValidator implements SmartValidator {
	private static final Logger LOG = LoggerFactory.getLogger(BirthOfYearDTOValidator.class);
	
	@Override
	public boolean supports(Class<?> clazz) {
		return BirthOfYearDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void validate(Object o, Errors errors, Object... objects) {
		String fieldName = (String) Optional.ofNullable(objects).map((objects1) -> {
			return (String) objects1[0];
		}).orElse("");

		try {
			if (!this.isValidBirthOfYear(o)) {
				LOG.error("BirthOfYearDTO validation failed.");
				errors.rejectValue("baseField", "E-0108", (Object[]) null, fieldName + "." + "birthOfYearFormControl");
			}
		} catch (VLDException arg6) {
			String[] message = new String[]{arg6.getMessage()};
			LOG.error("Exception encountered when validating Name due to erroneous parameters.");
			errors.rejectValue("baseField", "error.nomessageId", message, fieldName + "." + "birthOfYearFormControl");
			arg6.printStackTrace();
		}
	}

	private boolean isValidBirthOfYear(Object o) throws VLDException {
		boolean isValidBirthOfYear = true;
		BirthOfYearDTO birthOfYearDTO = (BirthOfYearDTO) o;
		if(birthOfYearDTO.getBirthOfYear()==null||birthOfYearDTO.getBirthOfYear().equals("")) {
			return isValidBirthOfYear = false;
		}else {
			return isValidBirthOfYear;
		}
	}







}



