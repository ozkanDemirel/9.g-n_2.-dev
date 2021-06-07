package com.kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.ExperienceService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.entities.concretes.Experience;

@RestController
@RequestMapping("/api/experiences")
public class ExperienceController {
	
	private ExperienceService experienceService;

	@Autowired
	public ExperienceController(ExperienceService experienceService) {
		this.experienceService = experienceService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Experience experience) {
		
		return this.experienceService.add(experience);
	}

	@GetMapping("/getAllByJobSeekerIdOrderByEndAtDesc")
	public DataResult<List<Experience>> getAllByJobSeekerIdOrderByEndAtDesc(int id) {
		return this.experienceService.getAllByJobSeekerIdOrderByEndAtDesc(id);
	}
	
}
