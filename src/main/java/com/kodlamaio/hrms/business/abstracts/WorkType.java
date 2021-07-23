package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.WorkTime;

public interface WorkType {
	
	//DataResult<WorkType>geyByWorkTypeId(int id);
	DataResult<List<WorkType>> getAll();
	Result add(WorkType workType);

}
