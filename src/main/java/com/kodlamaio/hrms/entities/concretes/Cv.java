package com.kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cvs")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name = "job_seeker_id", referencedColumnName =  "user_id")
	private JobSeeker jobSeeker;
	
	@OneToMany(mappedBy = "cv")
	private List<Experience> experience;
	
	@OneToMany(mappedBy = "cv")
	private List<ForeignLanguage> language;
	
	@OneToMany(mappedBy = "cv")
	private List<ProgrammingSkill> programmingSkill;
	
	@OneToMany(mappedBy = "cv")
	private List<School> school;
	
	@OneToMany(mappedBy = "cv")
	private List<Technology> technology;
	
	@OneToMany(mappedBy = "cv")
	private List<CoverLetter> coverLetter;
	

}
