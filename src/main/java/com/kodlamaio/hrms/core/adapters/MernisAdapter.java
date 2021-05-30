package com.kodlamaio.hrms.core.adapters;

import java.rmi.RemoteException;

import com.kodlamaio.hrms.core.validations.abstracts.JobSeekerCheckService;
import com.kodlamaio.hrms.entities.concretes.JobSeeker;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements JobSeekerCheckService {

		@Override
	public boolean CheckIfRealPerson(JobSeeker jobSeeker) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		boolean result = client.TCKimlikNoDogrula(Long.parseLong(jobSeeker.getIdentityNumber()),
				jobSeeker.getFirstName().toUpperCase(), jobSeeker.getLastName().toUpperCase(), jobSeeker.getDateOfBirth().getYear());
		return result;
	

		}
}
