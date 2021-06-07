package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.ProgrammingSkillService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.dataAccess.abstracts.ProgrammingSkillDao;
import com.kodlamaio.hrms.entities.concretes.ProgrammingSkill;

@Service
public class ProgramminSkillManager implements ProgrammingSkillService{
	
	private ProgrammingSkillDao programmingSkillDao;
	
	@Autowired
	public ProgramminSkillManager(ProgrammingSkillDao programmingSkillDao) {
		this.programmingSkillDao = programmingSkillDao;
	}


	@Override
	public DataResult<List<ProgrammingSkill>> getAllByJobSeekerId(int id) {
		return new SuccessDataResult<List<ProgrammingSkill>>(this.programmingSkillDao.getAllByJobSeekerId(id));
	}


	@Override
	public Result add(ProgrammingSkill programmingSkill) {

		this.programmingSkillDao.save(programmingSkill);
		return new SuccessResult("Kayıt Başarılı");
	}

}
