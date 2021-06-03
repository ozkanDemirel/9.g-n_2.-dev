package com.kodlamaio.hrms.entities.concretes.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertAdd {
	
	private int id;
	private String companyName;
	private String jobPosition;
	private String city;
	private int salaryMin;
	private int salaryMax;
	private int openPositionCount;
	private Date deadline;
	

}
