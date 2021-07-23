package com.kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.CvService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.entities.concretes.Cv;

@RestController
@RequestMapping("/api/cv")
public class CvController {
	
	private CvService cvService;

	@Autowired
	public CvController(CvService cvService) {
		this.cvService = cvService;
	}
	
	@GetMapping("getById")
	public DataResult<List<Cv>> getById(@RequestParam int id) {
		return this.cvService.getByJobSeekerId(id);
	}
	

}
