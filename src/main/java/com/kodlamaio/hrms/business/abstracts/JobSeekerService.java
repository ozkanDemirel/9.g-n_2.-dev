package com.kodlamaio.hrms.business.abstracts;


import java.rmi.RemoteException;
import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.validations.abstracts.JobSeekerCheckService;
import com.kodlamaio.hrms.entities.concretes.JobSeeker;
import com.kodlamaio.hrms.entities.concretes.School;
import com.kodlamaio.hrms.entities.dtos.CvDto;

public interface JobSeekerService {
	
	Result register (JobSeeker jobSeeker) throws NumberFormatException, RemoteException ;
	DataResult<List<JobSeeker>> getAll();
	DataResult<CvDto>  getCvById(int id);
	
	
	
}
