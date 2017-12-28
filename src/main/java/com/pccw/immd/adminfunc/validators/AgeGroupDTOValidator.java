package com.pccw.immd.adminfunc.validators;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.SmartValidator;



import com.pccw.immd.commons.util.VLDException;
import com.pccw.immd.adminfunc.dto.AgeGroupDTO;
import com.pccw.immd.adminfunc.dto.BirthOfDateDTO;


@Component
public class AgeGroupDTOValidator implements SmartValidator {
	private static final Logger LOG = LoggerFactory.getLogger(AgeGroupDTOValidator.class);
	
	@Override
	public boolean supports(Class<?> clazz) {
		return AgeGroupDTO.class.equals(clazz);
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
			if (!this.isValidAgeGroup(o)) {
				LOG.error("AgeGroupDTO validation failed.");
				errors.rejectValue("baseField", "E-0106", (Object[]) null, fieldName + "." + "ageGroupFormControl");
			}
		} catch (VLDException arg6) {
			String[] message = new String[]{arg6.getMessage()};
			LOG.error("Exception encountered when validating Name due to erroneous parameters.");
			errors.rejectValue("baseField", "error.nomessageId", message, fieldName + "." + "ageGroupFormControl");
			arg6.printStackTrace();
		}
	}

	private boolean isValidAgeGroup(Object o) throws VLDException {
		boolean isValidAgeGroup = true;
		AgeGroupDTO ageGroupDTO = (AgeGroupDTO) o;
		if(ageGroupDTO.getAgeGroup()==null||ageGroupDTO.getAgeGroup().equals("")) {
			return isValidAgeGroup = false;
		}else {
			return isValidAgeGroup;
		}
	}







}



