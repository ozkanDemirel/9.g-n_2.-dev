package com.kodlamaio.hrms.business.abstracts;


import java.rmi.RemoteException;
import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.validations.abstracts.JobSeekerCheckService;
import com.kodlamaio.hrms.entities.concretes.JobSeeker;
import com.kodlamaio.hrms.entities.concretes.School;

public interface JobSeekerService {
	
	Result register (JobSeeker jobSeeker) throws NumberFormatException, RemoteException ;
	public DataResult<List<JobSeeker>> getAll();
	
	
	
}
