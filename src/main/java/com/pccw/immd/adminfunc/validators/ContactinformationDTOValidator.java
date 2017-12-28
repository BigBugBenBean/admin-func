package com.pccw.immd.adminfunc.validators;

import java.util.Optional;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.SmartValidator;

import com.pccw.immd.commons.util.VLDException;
import com.pccw.immd.adminfunc.dto.ContactinformationDTO;

@Component
public class ContactinformationDTOValidator implements SmartValidator {
	private static final Logger LOG = LoggerFactory.getLogger(NatureDTOValidator.class);
	private static Pattern p = Pattern.compile("^[a-zA-Z0-9]+([-][a-zA-Z0-9]+)*(.[a-zA-Z0-9]+([-][a-zA-Z0-9]+)*)*@[a-zA-Z0-9]+([-][a-zA-Z0-9]+)*(.[a-zA-Z0-9]+([-][a-zA-Z0-9]+)*){0,2}$");
	private static Pattern p1 = Pattern.compile("^(([0\\+]\\d{2,3}-)?(0\\d{2,3})-)?(\\d{7,8})(-(\\d{3,}))?$");
	
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return ContactinformationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object o, Errors arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validate(Object o, Errors errors, Object... objects) {
		// TODO Auto-generated method stub
		String fieldName = (String) Optional.ofNullable(objects).map((objects1) -> {
			return (String) objects1[0];
			}).orElse("");
		try {
			String[] message = new String[100];
			ContactinformationDTO contactinformationDto1 = (ContactinformationDTO) o;
			// LOG.info(contactinformationDto1.getContactinformation().substring(0, contactinformationDto1.getContactinformation().length()-1));
			if(contactinformationDto1.getContactinformation().endsWith("E") && !this.isValidContactinformation(o)) {
				LOG.error("Contactinformation validation failed.");
				//errors.rejectValue("baseField","contactinformation.invalid",(Object[]) null,fieldName + "." + "natureFormControl");
				message[0] = "Please input email for receiving the reminder";
				errors.rejectValue("baseField", "0501",message,fieldName + "." + "contactinformationFormControl");
			}
			else if(contactinformationDto1.getContactinformation().endsWith("T") && !this.isValidContactinformation(o)) {
				LOG.error("Contactinformation validation failed.");
				//errors.rejectValue("baseField","contactinformation.invalid",(Object[]) null,fieldName + "." + "natureFormControl");
				message[0] = "Please input the telephone number to receive SMS";
				errors.rejectValue("baseField", "0103",message,fieldName + "." + "contactinformationFormControl");
			}
			else if(contactinformationDto1.getContactinformation().endsWith("E") && !this.isValidContactinformation1(o)) {
				
				LOG.error("Contactinformation validation failed.");
				//errors.rejectValue("baseField","contactinformation.invalid",(Object[]) null,fieldName + "." + "natureFormControl");
				message[0] = "Please input valid email for receiving the reminder";
				errors.rejectValue("baseField","0102",message,fieldName + "." + "contactinformationFormControl");
				
				
			}
			else if(contactinformationDto1.getContactinformation().endsWith("T") && !this.isValidContactinformation2(o)) {
				LOG.error("Contactinformation validation failed.");
				//errors.rejectValue("baseField","contactinformation.invalid",(Object[]) null,fieldName + "." + "natureFormControl");
				message[0] = "Please input valid telephone for SMS";
				errors.rejectValue("baseField","0104",message,fieldName + "." + "contactinformationFormControl");
			}
		} catch (VLDException arg6) {
			String[] message = new String[] {arg6.getMessage()};
			LOG.error("Exception encountered when validating Contactinformation due to errorneous parameters.");
			errors.rejectValue("baseField","error.nomessageId",message,fieldName + "." + "contactinformationFormControl");
			arg6.printStackTrace();
		}
		
	}

	private boolean isValidContactinformation(Object o) throws VLDException {
		// TODO Auto-generated method stub
		boolean isValidContactinfo = true;
		ContactinformationDTO contactinformationDto = (ContactinformationDTO) o;
		int len = contactinformationDto.getContactinformation().length();
		if(len == 1 || StringUtils.isBlank(contactinformationDto.getContactinformation().substring(0, len - 1)) || contactinformationDto.getContactinformation().substring(0, len - 1).toLowerCase().equals("null") || contactinformationDto.getContactinformation().substring(0, len - 1).toLowerCase().equals("undefined")) {
			isValidContactinfo = false;
		}
		return isValidContactinfo;
	}
	
	private boolean isValidContactinformation1(Object o) throws VLDException {
		// TODO Auto-generated method stub
		boolean isValidContactinfo = true;
		ContactinformationDTO contactinformationDto = (ContactinformationDTO) o;
		int len = contactinformationDto.getContactinformation().length();
//		if(StringUtils.isEmpty(contactinformationDto.getContactinformation())) {
//			isValidNature = false;
//		}
//		else 
		if(!p.matcher(contactinformationDto.getContactinformation().substring(0, len - 1)).matches()) {
		isValidContactinfo = false;
	}
		return isValidContactinfo;
	}
	
	private boolean isValidContactinformation2(Object o) throws VLDException {
		// TODO Auto-generated method stub
		boolean isValidContactinfo = true;
		ContactinformationDTO contactinformationDto = (ContactinformationDTO) o;
		int len = contactinformationDto.getContactinformation().length();
		/*if(StringUtils.isEmpty(contactinformationDto.getContactinformation())) {
			isValidNature = false;
		}*/
		//else 
			if(!p1.matcher(contactinformationDto.getContactinformation().substring(0, len - 1)).matches()) {
			isValidContactinfo = false;
		}
		return isValidContactinfo;
	}
}
