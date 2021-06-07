package com.kodlamaio.hrms.core.validations.concretes;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.kodlamaio.hrms.entities.concretes.PhotoUpload;

public class PhotoUploadValidator implements Validator {

	@Override
	public boolean supports(Class clazz) {
        return PhotoUpload.class.equals(clazz);
    }

	@Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "title", "title.empty");
        PhotoUpload pu = (PhotoUpload) obj;
        if (pu.getFile() == null || pu.getFile().isEmpty()) {
            if (!pu.validSignature()) {
                e.rejectValue("signature", "signature.mismatch");
            }
        }
    }

}
