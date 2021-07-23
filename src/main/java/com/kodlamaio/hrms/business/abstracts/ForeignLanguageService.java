package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.ForeignLanguage;
import com.kodlamaio.hrms.entities.concretes.JobSeeker;

public interface ForeignLanguageService {
	
	Result add(ForeignLanguage foreignLanguage);
	DataResult<List<ForeignLanguage>> getAllByJobSeekerId(int id);
	DataResult<List<ForeignLanguage>> getAll();

}
