package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.EmployerService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.ErrorResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.core.validations.abstracts.EmailValidatorService;
import com.kodlamaio.hrms.core.validations.abstracts.JobSeekerCheckService;
import com.kodlamaio.hrms.core.validations.concretes.ConfirmedByEmployee;
import com.kodlamaio.hrms.core.validations.concretes.EmailValidatorManager;
import com.kodlamaio.hrms.core.validations.concretes.JobSeekerCheckManager;
import com.kodlamaio.hrms.core.validations.concretes.RegisterControl;
import com.kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import com.kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	private JobSeekerCheckService check;
	private EmailValidatorService emailValidatorService;
	private ConfirmedByEmployee confirmedByEmployee;
	
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		
		this.employerDao = employerDao;
		this.check = new JobSeekerCheckManager();
		this.emailValidatorService = new EmailValidatorManager();
		this.confirmedByEmployee = new ConfirmedByEmployee();
	}


	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Data Listelendi");
	}


	@Override
	public Result register(Employer employer) {
		
		if(!RegisterControl.isCheckEmail(employer)) {
			return new ErrorResult("Email Alanını Kontrol Ediniz.");
		}
		
		else {
			emailValidatorService.sendMail(employer);
			 if((emailValidatorService.isEmailVerified()==false) || (confirmedByEmployee.isConfirm(false))) {
				return new ErrorResult("Doğrulama Gerekli");
			}
			 
			 else {
				 
				employer.setVerified(true);
				this.employerDao.save(employer);
				return new SuccessResult("Kullanıcı Eklendi");
			}
			
		}
				
	}
	
	
}
