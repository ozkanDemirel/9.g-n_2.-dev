package com.kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.ForeignLanguage;
import com.kodlamaio.hrms.entities.concretes.JobSeeker;

public interface ForeignLanguageDao extends JpaRepository<ForeignLanguage, Integer> {
	
	List<ForeignLanguage> getAllByJobSeekerId(int id);

}
