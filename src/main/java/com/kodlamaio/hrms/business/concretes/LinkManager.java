package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.LinkService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.dataAccess.abstracts.LinkDao;
import com.kodlamaio.hrms.entities.concretes.Link;

@Service
public class LinkManager implements LinkService{

	private LinkDao linkDao;
	
	@Autowired
	public LinkManager(LinkDao linkDao) {
		this.linkDao = linkDao;
	}


	@Override
	public DataResult<List<Link>> getAllByJobSeekerId(int id) {
		return new SuccessDataResult<List<Link>>(this.linkDao.getAllByJobSeekerId(id));
	}


	@Override
	public Result add(Link link) {
		this.linkDao.save(link);
		return new SuccessResult("Kayıt Başarılı");
	}

}
