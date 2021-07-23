package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import com.kodlamaio.hrms.business.abstracts.WorkTimeService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.dataAccess.abstracts.WorkTimeDao;
import com.kodlamaio.hrms.entities.concretes.WorkTime;

public class WorkTimeManager implements WorkTimeService{

	private WorkTimeDao workTimeDao;
	
	public WorkTimeManager(WorkTimeDao workTimeDao) {
		this.workTimeDao = workTimeDao;
	}

	/*@Override
	public DataResult<WorkTime> geyByWorkTimeId(int id) {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public DataResult<List<WorkTime>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(WorkTime workTime) {
		// TODO Auto-generated method stub
		return null;
	}

}
