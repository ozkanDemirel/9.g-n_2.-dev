package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Link;

public interface LinkService {
	
	Result add(Link link);
	DataResult<List<Link>> getAllByJobSeekerId(int id);

}
