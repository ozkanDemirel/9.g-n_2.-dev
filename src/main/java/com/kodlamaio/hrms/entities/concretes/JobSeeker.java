package com.kodlamaio.hrms.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

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
	
	@NotBlank(message = "Bu Alan boş geçilemez")
	@Column(name = "first_name")
	private String firstName;
	
	@NotBlank(message = "Bu Alan boş geçilemez")
	@Column(name = "last_name")
	private String lastName;
	
	@Size(min = 11,max = 11,message = "TC Kimlik Numarranız 11 haneli olmalıdır.")
	@NotBlank(message = "Bu Alan boş geçilemez")
	@Column(name = "national_id")
	private String identityNumber;
	
	@NotBlank(message = "Bu Alan boş geçilemez")
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	
	@Column(name = "github")
	private String github;
	
	@Column(name = "linkedin")
	private String linkedin;
	
	@Column(name = "is_verified")
	private boolean isVerified = false;
	
	@ManyToOne()
	@JoinColumn(name="cv_id")
	private Cv cv;
	
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
