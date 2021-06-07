package com.kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.TeknologyService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Teknology;

@RestController
@RequestMapping("/api/teknologies")
public class TeknologyController {
	
	private TeknologyService teknologyService;

	@Autowired
	public TeknologyController(TeknologyService teknologyService) {
		this.teknologyService = teknologyService;
	}
	
	@GetMapping("/getAllByJobSeekerId")
	public DataResult<List<Teknology>> getAllByJobSeekerId(@RequestParam int id) {
		return this.teknologyService.getAllByJobSeekerId(id);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Teknology teknology) {
		
		return this.teknologyService.add(teknology);
	}

}
