package com.kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "experiences")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Experience {
	
	@Id
	@Column(name = "id")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "working_place")
	private String workingPlace;
	
	@Column(name = "position")
	private String position;
	
	@Column(name = "start_at")
	private LocalDate startAt;
	
	@Column(name = "end_at")
	private LocalDate endAt;
	
	@ManyToOne()
	@JoinColumn(name="cv_id")
	private Cv cv;
	
	@JsonIgnore
	@ManyToOne()
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;

}
