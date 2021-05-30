package com.kodlamaio.hrms.core.validations.concretes;

import com.kodlamaio.hrms.core.validations.abstracts.EmailValidatorService;
import com.kodlamaio.hrms.entities.abstracts.User;

public class EmailValidatorManager implements EmailValidatorService{
		
	public String sendMail(User user) {
		return user.getEmail()+" Adresine Doğrulama Maili Gönderildi";
	}
	
	public boolean isEmailVerified() {
		return true;
	}
}
