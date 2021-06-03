package com.kodlamaio.hrms.core.validations.abstracts;

import com.kodlamaio.hrms.core.entities.User;

public interface EmailValidatorService {

	public String sendMail(User user);
	
	public boolean isEmailVerified();
}
