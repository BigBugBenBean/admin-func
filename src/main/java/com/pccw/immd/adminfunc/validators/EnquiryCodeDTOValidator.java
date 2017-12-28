package com.pccw.immd.adminfunc.validators;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.SmartValidator;



import com.pccw.immd.commons.util.VLDException;
import com.pccw.immd.adminfunc.dto.EnquiryCodeDTO;


@Component
public class EnquiryCodeDTOValidator implements SmartValidator {
	private static final Logger LOG = LoggerFactory.getLogger(EnquiryCodeDTOValidator.class);
	
	@Override
	public boolean supports(Class<?> clazz) {
		return EnquiryCodeDTO.class.equals(clazz);
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
			if (!this.isValidEnquiryCode(o)) {
				LOG.error("EnquiryCodeDTO validation failed.");
				errors.rejectValue("baseField", "E-0109", (Object[]) null, fieldName + "." + "enquiryCodeFormControl");
			}
		} catch (VLDException arg6) {
			String[] message = new String[]{arg6.getMessage()};
			LOG.error("Exception encountered when validating Name due to erroneous parameters.");
			errors.rejectValue("baseField", "error.nomessageId", message, fieldName + "." + "enquiryCodeFormControl");
			arg6.printStackTrace();
		}
	}

	private boolean isValidEnquiryCode(Object o) throws VLDException {
		boolean isValidEnquiryCode = true;
		EnquiryCodeDTO enquiryCodeDTO = (EnquiryCodeDTO) o;
		if(enquiryCodeDTO.getEnquiryCode()==null||enquiryCodeDTO.getEnquiryCode().equals("")) {
			return isValidEnquiryCode = false;
		}else {
			return isValidEnquiryCode;
		}
	}







}



