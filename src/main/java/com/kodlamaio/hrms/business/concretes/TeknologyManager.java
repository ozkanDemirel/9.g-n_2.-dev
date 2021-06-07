package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.TeknologyService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.dataAccess.abstracts.TeknologyDao;
import com.kodlamaio.hrms.entities.concretes.Teknology;

@Service
public class TeknologyManager implements TeknologyService {
	
	private TeknologyDao teknologyDao;
	
	@Autowired
	public TeknologyManager(TeknologyDao teknologyDao) {
		this.teknologyDao = teknologyDao;
	}


	@Override
	public DataResult<List<Teknology>> getAllByJobSeekerId(int id) {
		return new SuccessDataResult<List<Teknology>>(this.teknologyDao.getAllByJobSeekerId(id));
	}


	@Override
	public Result add(Teknology teknology) {
		this.teknologyDao.save(teknology);
		return new SuccessResult("Kayıt Başarılı");
	}

}
