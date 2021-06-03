package com.kodlamaio.hrms.dataAccess.abstracts;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.entities.concretes.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer> {
	
	@Query("From JobAdvert where isOpen = true")
	List<JobAdvert> getAllOpenJobAdvertList();
	
	@Query("From JobAdvert where isOpen = true Order By publicationDate Desc")
	List<JobAdvert> getAllOrderByPublicationDateDesc();
	
	@Query("From JobAdvert where isOpen = true Order By publicationDate Desc")
	List<JobAdvert> getAllOpenJobAdvertByEmployer();
	
	
	
}
