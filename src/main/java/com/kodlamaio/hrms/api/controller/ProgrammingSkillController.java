package com.kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.ProgrammingSkillService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.entities.concretes.ProgrammingSkill;

@RestController
@RequestMapping("/api/programmingskills")
public class ProgrammingSkillController {
	
	private ProgrammingSkillService programmingSkillService;

	@Autowired
	public ProgrammingSkillController(ProgrammingSkillService programmingSkillService) {
		this.programmingSkillService = programmingSkillService;
	}
	
	@GetMapping("/getAllByJobSeekerId")
	public DataResult<List<ProgrammingSkill>> getAllByJobSeekerId(@RequestParam int id) {
		return this.programmingSkillService.getAllByJobSeekerId(id);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ProgrammingSkill programmingSkill) {
		return this.programmingSkillService.add(programmingSkill);
	}
}
