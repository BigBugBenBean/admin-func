package com.pccw.immd.adminfunc.validators;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.SmartValidator;



import com.pccw.immd.commons.util.VLDException;
import com.pccw.immd.adminfunc.dto.CapcheDTO;
import com.pccw.immd.adminfunc.dto.EnquiryCodeDTO;


@Component
public class CapcheDTOValidator implements SmartValidator {
	private static final Logger LOG = LoggerFactory.getLogger(CapcheDTOValidator.class);
	
	@Override
	public boolean supports(Class<?> clazz) {
		return CapcheDTO.class.equals(clazz);
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
			String[] message = new String[5];
			CapcheDTO capcheDTO = (CapcheDTO) o;
			if (!this.isValidCapche(o)) {
				LOG.error("CapcheDTO validation failed.");
				message[0] = "No input for CAPCHE validation!";
				errors.rejectValue("baseField", "E-0111",message,fieldName + "." + "capcheFormControl");
			}else {
				if(!capcheDTO.getCapche().equals(capcheDTO.getCapcheOriginal())) {
					LOG.error("CapcheDTO validation failed.");
					message[0] = "The input answer for CAPCHE is not correct!";
					errors.rejectValue("baseField", "E-0112",message,fieldName + "." + "capcheFormControl");
				}
			}
		} catch (VLDException arg6) {
			String[] message = new String[]{arg6.getMessage()};
			LOG.error("Exception encountered when validating Name due to erroneous parameters.");
			errors.rejectValue("baseField", "error.nomessageId", message, fieldName + "." + "capcheFormControl");
			arg6.printStackTrace();
		}
	}

	private boolean isValidCapche(Object o) throws VLDException {
		boolean isValidCapche = true;
		CapcheDTO CapcheDTO = (CapcheDTO) o;
		if(CapcheDTO.getCapche()==null||CapcheDTO.getCapche().equals("")) {
			return isValidCapche = false;
		}else {
			return isValidCapche;
		}
	}







}



