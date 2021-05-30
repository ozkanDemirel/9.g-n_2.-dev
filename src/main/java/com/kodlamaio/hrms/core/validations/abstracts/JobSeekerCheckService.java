package com.kodlamaio.hrms.core.validations.abstracts;

import java.rmi.RemoteException;

import com.kodlamaio.hrms.entities.concretes.JobSeeker;

public interface JobSeekerCheckService {
	boolean CheckIfRealPerson(JobSeeker jobSeeker) throws NumberFormatException, RemoteException ;

	
}
