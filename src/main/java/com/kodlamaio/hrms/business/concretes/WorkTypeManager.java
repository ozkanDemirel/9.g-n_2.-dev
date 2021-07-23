package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.WorkType;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.dataAccess.abstracts.WorkTypeDao;

@Service
public class WorkTypeManager implements WorkType {
	
	private WorkTypeDao workTypeDao;
	
	@Autowired
	public WorkTypeManager(WorkTypeDao workTypeDao) {
		super();
		this.workTypeDao = workTypeDao;
	}

	/*@Override
	public DataResult<WorkType> geyByWorkTypeId(int id) {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public DataResult<List<WorkType>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(WorkType workType) {
		// TODO Auto-generated method stub
		return null;
	}

}
