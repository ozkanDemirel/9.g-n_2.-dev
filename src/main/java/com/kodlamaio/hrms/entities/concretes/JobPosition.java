package com.kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;


@Data
@Entity
@Table(name ="job_positions")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"})
public class JobPosition {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "job_title")
	private String jobTitle;
	
	@OneToMany(mappedBy = "jobPosition")
	List<JobAdvert> jobAdverts;

}
