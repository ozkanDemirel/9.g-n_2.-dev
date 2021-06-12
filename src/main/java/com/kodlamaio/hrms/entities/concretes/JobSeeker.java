package com.kodlamaio.hrms.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kodlamaio.hrms.core.entities.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name ="job_seekers")
@AllArgsConstructor
@NoArgsConstructor
@Data
@PrimaryKeyJoinColumn(name ="user_id")
public class JobSeeker extends User{
	
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "national_id")
	private String identityNumber;
	
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	
	@Column(name = "github")
	private String github;
	
	@Column(name = "linkedin")
	private String linkedin;
	
	@Column(name = "is_verified")
	private boolean isVerified = false;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<School> schools;

	@JsonIgnore
	@OneToMany(mappedBy = "jobSeeker")
	private List<Experience> experiences;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobSeeker")
	private List<ForeignLanguage> foreignLanguages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobSeeker")
	private List<ProgrammingSkill> programmingSkills;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobSeeker")
	private List<Technology> teknology;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobSeeker")
	private List<Link> links; 
	
	@JsonIgnore
	@OneToOne(mappedBy = "jobSeeker", optional=false, fetch=FetchType.LAZY)
	private Photo photo;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobSeeker")
	private List<CoverLetter>  coverLetters;

}
