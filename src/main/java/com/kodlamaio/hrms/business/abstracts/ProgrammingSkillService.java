package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.ProgrammingSkill;

public interface ProgrammingSkillService {
	
	Result add(ProgrammingSkill programmingSkill);
	DataResult<List<ProgrammingSkill>> getAllByJobSeekerId(int id);
}
