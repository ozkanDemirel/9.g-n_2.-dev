package com.kodlamaio.hrms.core.validations.concretes;

import com.kodlamaio.hrms.core.validations.abstracts.JobSeekerCheckService;
import com.kodlamaio.hrms.entities.concretes.JobSeeker;

public class JobSeekerCheckManager implements JobSeekerCheckService{

	@Override
	public boolean CheckIfRealPerson(JobSeeker jobSeeker) {
		return true;
	}

}
