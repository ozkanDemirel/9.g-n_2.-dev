package com.kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.Teknology;

public interface TeknologyDao extends JpaRepository<Teknology, Integer> {
	List<Teknology> getAllByJobSeekerId(int id);
}
