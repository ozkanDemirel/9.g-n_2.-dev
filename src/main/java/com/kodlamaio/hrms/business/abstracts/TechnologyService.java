package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Technology;

public interface TechnologyService {
	
	Result add(Technology technology);
	DataResult<List<Technology>> getAllByJobSeekerId(int id);
}
