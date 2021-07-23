package com.kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.Cv;

public interface CvDetailDao extends JpaRepository<Cv, Integer>  {
	
	List<Cv> getByJobSeekerId(int id);

}
