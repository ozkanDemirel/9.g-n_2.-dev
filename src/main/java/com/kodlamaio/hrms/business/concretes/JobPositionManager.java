package com.kodlamaio.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.JobPositionService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.ErrorResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import com.kodlamaio.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
	
	@Autowired
	private JobPositionDao jobPositionDao;

	@Override
	public DataResult<List<JobPosition>> getAll() {
		
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(), "Data Listelendi");
	}

	@Override
	public Result add(JobPosition jobPosition) {
		
		List<JobPosition> positions = this.jobPositionDao.findAll();
		for (JobPosition position : positions) {
			if(position.getJobTitle().equals(jobPosition.getJobTitle())) {
				
				return new ErrorResult("İş Pozisyonu Zaten Var");
			}
		}
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("İş Pozisyonu Eklendi");
	}

}
