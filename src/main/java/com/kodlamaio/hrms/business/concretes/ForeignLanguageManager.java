package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.ForeignLanguageService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.dataAccess.abstracts.ForeignLanguageDao;
import com.kodlamaio.hrms.entities.concretes.ForeignLanguage;
import com.kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class ForeignLanguageManager implements ForeignLanguageService{
	
	private ForeignLanguageDao foreignLanguageDao;
	
	@Autowired
	public ForeignLanguageManager(ForeignLanguageDao foreignLanguageDao) {
		this.foreignLanguageDao = foreignLanguageDao;
	}


	@Override
	public Result add(ForeignLanguage foreignLanguage) {
		this.foreignLanguageDao.save(foreignLanguage);
		return new SuccessResult("Yabancı Dil Bilgisi Eklendi");
	}


	@Override
	public DataResult<List<ForeignLanguage>> getAllByJobSeekerId(int id) {
		return new SuccessDataResult<List<ForeignLanguage>>(this.foreignLanguageDao.getAllByJobSeekerId(id),"Yabancı Diller Listelendi");
	}

}
