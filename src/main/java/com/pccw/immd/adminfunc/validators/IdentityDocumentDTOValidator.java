package com.pccw.immd.adminfunc.validators;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.SmartValidator;



import com.pccw.immd.commons.util.VLDException;
import com.pccw.immd.adminfunc.dto.IdentityDocumentDTO;


@Component
public class IdentityDocumentDTOValidator implements SmartValidator {
	private static final Logger LOG = LoggerFactory.getLogger(IdentityDocumentDTOValidator.class);
	
	@Override
	public boolean supports(Class<?> clazz) {
		return IdentityDocumentDTO.class.equals(clazz);
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
			if (!this.isValidIdentityDocument(o)) {
				LOG.error("IdentityDocument validation failed.");
				errors.rejectValue("baseField", "E-0102", (Object[]) null, fieldName + "." + "identityDocumentFormControl");
			}
		} catch (VLDException arg6) {
			String[] message = new String[]{arg6.getMessage()};
			LOG.error("Exception encountered when validating Name due to erroneous parameters.");
			errors.rejectValue("baseField", "error.nomessageId", message, fieldName + "." + "identityDocumentFormControl");
			arg6.printStackTrace();
		}
	}

	private boolean isValidIdentityDocument(Object o) throws VLDException {
		boolean isValidIdentityDocument = true;
		IdentityDocumentDTO identityDocumentDTO = (IdentityDocumentDTO) o;
		if(identityDocumentDTO.getIdentityDocument()==null||identityDocumentDTO.getIdentityDocument().equals("0")) {
			return isValidIdentityDocument = false;
		}else {
			return isValidIdentityDocument;
		}
	}







}



