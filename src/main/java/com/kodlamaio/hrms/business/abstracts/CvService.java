package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Cv;

public interface CvService {
	Result add(Cv cv);
	DataResult<List<Cv>> getByJobSeekerId(int id);
}
