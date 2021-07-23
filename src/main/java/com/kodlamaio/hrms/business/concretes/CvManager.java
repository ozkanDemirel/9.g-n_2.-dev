package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.CvService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.dataAccess.abstracts.CvDetailDao;
import com.kodlamaio.hrms.entities.concretes.Cv;

@Service
public class CvManager implements CvService{

	CvDetailDao cvDetailDao;
	
	@Autowired
	public CvManager(CvDetailDao cvDetailDao) {
		this.cvDetailDao = cvDetailDao;
	}


	@Override
	public Result add(Cv cv) {
		this.cvDetailDao.save(cv);
		return new SuccessResult("Kayıt Eklendi");
	}


	@Override
	public DataResult<List<Cv>> getByJobSeekerId(int id) {
		return  new SuccessDataResult<List<Cv>>(this.cvDetailDao.getByJobSeekerId(id),"Data Listelendi");
	}

}
