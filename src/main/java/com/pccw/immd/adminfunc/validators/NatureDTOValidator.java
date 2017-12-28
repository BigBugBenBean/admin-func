package com.pccw.immd.adminfunc.validators;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.SmartValidator;



import com.pccw.immd.commons.util.VLDException;
import com.pccw.immd.adminfunc.dto.NatureDTO;

@Component
public class NatureDTOValidator implements SmartValidator {
	private static final Logger LOG = LoggerFactory.getLogger(NatureDTOValidator.class);
	
	@Override
	public boolean supports(Class<?> clazz) {
		return NatureDTO.class.equals(clazz);
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
			if (!this.isValidNature(o)) {
				LOG.error("Nature validation failed.");
				errors.rejectValue("baseField", "E-0101", (Object[]) null, fieldName + "." + "natureFormControl");
			}
		} catch (VLDException arg6) {
			String[] message = new String[]{arg6.getMessage()};
			LOG.error("Exception encountered when validating Name due to erroneous parameters.");
			errors.rejectValue("baseField", "error.nomessageId", message, fieldName + "." + "natureFormControl");
			arg6.printStackTrace();
		}
	}

	private boolean isValidNature(Object o) throws VLDException {
		boolean isValidNature = true;
		NatureDTO natureDto = (NatureDTO) o;
		if(natureDto.getNature()==null||natureDto.getNature().equals("0")) {
			return isValidNature = false;
		}else {
			return isValidNature;
		}
	}







}



