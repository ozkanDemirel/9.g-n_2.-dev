package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.JobAdvert;

public interface JobAdvertService {
																		
	DataResult<List<JobAdvert>> getAllOpenJobAdvertList();
	DataResult<List<JobAdvert>> getAllOrderByPublicationDateDesc();
	DataResult<List<JobAdvert>> getAllOpenJobAdvertByEmployer();
	DataResult<List<JobAdvert>> getAll();
	Result add (JobAdvert jobAdvert);
	Result delete(int id );
	Result update (JobAdvert jobAdvert);
}
