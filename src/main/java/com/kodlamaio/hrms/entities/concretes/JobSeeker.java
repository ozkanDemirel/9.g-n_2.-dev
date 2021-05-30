package com.kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.kodlamaio.hrms.entities.abstracts.User;

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
	
	@Column(name = "is_verified")
	private boolean isVerified = false;



}
