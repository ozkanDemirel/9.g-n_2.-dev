package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.WorkType;

public interface WorkTypeDao extends JpaRepository<WorkType, Integer> {
	
	//WorkType geyByWorkTypeId(int id);

}
