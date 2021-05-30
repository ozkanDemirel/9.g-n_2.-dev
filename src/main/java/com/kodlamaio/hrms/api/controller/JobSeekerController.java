package com.kodlamaio.hrms.api.controller;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.JobSeekerService;
import com.kodlamaio.hrms.core.adapters.MernisAdapter;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.validations.abstracts.JobSeekerCheckService;
import com.kodlamaio.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobSeekers")
public class JobSeekerController {

	private JobSeekerService jobSeekerService;
	

	@Autowired
	public JobSeekerController(JobSeekerService jobSeekerService) {
		this.jobSeekerService = jobSeekerService;
	}

	@GetMapping("/getAll")
	public DataResult<List<JobSeeker>> getAll() {

		return this.jobSeekerService.getAll();
	}

	@PostMapping("/register")
	public Result register(@RequestBody JobSeeker jobSeeker) throws NumberFormatException, RemoteException {

		return this.jobSeekerService.register(jobSeeker  );
	}

}
