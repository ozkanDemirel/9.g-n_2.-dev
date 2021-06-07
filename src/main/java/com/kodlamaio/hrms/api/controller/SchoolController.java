package com.kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.SchoolService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.entities.concretes.School;

@RestController
@RequestMapping("api/schools")
public class SchoolController {
	
	private SchoolService schoolService;

	@Autowired
	public SchoolController(SchoolService schoolService) {
		this.schoolService = schoolService;
	}
	
	
	
	@GetMapping("/getAllByJobSeekerIdOrderByEndAtDesc")
	public DataResult<List<School>> getAllByJobSeekerIdOrderByEndAtDesc(@RequestParam int id) {
		return this.schoolService.getAllByJobSeekerIdOrderByEndAtDesc(id);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody School school) {
		this.schoolService.add(school);
		return new SuccessResult("Okul Bilgisi Eklendi");
	}
	
	@GetMapping("/getAll")
	public DataResult<List<School>> getAll() {
		return this.schoolService.getAll();
	}

}
