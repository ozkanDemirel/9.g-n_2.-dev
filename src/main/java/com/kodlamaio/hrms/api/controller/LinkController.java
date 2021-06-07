package com.kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.LinkService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.entities.concretes.Link;

@RestController
@RequestMapping("/api/links")
public class LinkController {
	
	private LinkService linkService;
	
	@Autowired
	public LinkController(LinkService linkService) {
		this.linkService = linkService;
	}

	@GetMapping("getAllByJobSeekerId")
	public DataResult<List<Link>> getAllByJobSeekerId(@RequestParam int id) {
		return this.linkService.getAllByJobSeekerId(id);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Link link) {		
		return this.linkService.add(link);
	}

}
