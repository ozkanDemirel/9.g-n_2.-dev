package com.kodlamaio.hrms.entities.dtos;

import java.util.List;

import com.kodlamaio.hrms.entities.concretes.Experience;
import com.kodlamaio.hrms.entities.concretes.ForeignLanguage;
import com.kodlamaio.hrms.entities.concretes.JobSeeker;
import com.kodlamaio.hrms.entities.concretes.Link;
import com.kodlamaio.hrms.entities.concretes.Photo;
import com.kodlamaio.hrms.entities.concretes.ProgrammingSkill;
import com.kodlamaio.hrms.entities.concretes.School;
import com.kodlamaio.hrms.entities.concretes.Technology;

public class CvDto {
	
	public JobSeeker jobseeker;
	public List<School> schools;
	public List<ProgrammingSkill> programingSkills;
	public List<Link> links;
	public List<ForeignLanguage> languages;
	public List<Experience> experiences;
	public List<Technology> technologies;
	public Photo photo;

}
