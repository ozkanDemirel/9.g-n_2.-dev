package com.kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.JobAdvertService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.entities.concretes.JobAdvert;


@RestController
@RequestMapping("/api/jobAdverts")
public class JobAdvertController {
	
	private JobAdvertService jobAdvertService;
	
	@Autowired
	public JobAdvertController(JobAdvertService jobAdvertService) {
		this.jobAdvertService = jobAdvertService;
	}

	@GetMapping("/getAllOpenJobAdvertList")											
	public DataResult<List<JobAdvert>> getAllOpenJobAdvertList(){
		return this.jobAdvertService.getAllOpenJobAdvertList();
	}
	
	@GetMapping("/getAllOrderByPublicationDateDesc")
	public DataResult<List<JobAdvert>> getAllOrderByPublicationDateDesc(){
		return this.jobAdvertService.getAllOrderByPublicationDateDesc();
	}
	
	@GetMapping("/getAllOpenJobAdvertByEmployer")
	public DataResult<List<JobAdvert>> getAllOpenJobAdvertByEmployer(){
		return this.jobAdvertService.getAllOpenJobAdvertByEmployer();
	}
	
	@PostMapping("/add")
	public Result Add(@RequestBody JobAdvert jobAdvert) {
		
		return this.jobAdvertService.Add(jobAdvert);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam int id) {
		this.jobAdvertService.delete(id);
		return new SuccessResult("İş İlanı Başarıyla Silindi");
	}
	
}
