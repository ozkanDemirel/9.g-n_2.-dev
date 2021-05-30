package com.kodlamaio.hrms.core.validations.abstracts;

import com.kodlamaio.hrms.entities.abstracts.User;

public interface EmailValidatorService {

	public String sendMail(User user);
	
	public boolean isEmailVerified();
}
