package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.WorkTime;

public interface WorkTimeService {
	//DataResult<WorkTime>geyByWorkTimeId(int id);
	DataResult<List<WorkTime>> getAll();
	Result add(WorkTime workTime);
	
}
