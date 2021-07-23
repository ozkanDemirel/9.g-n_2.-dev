package com.kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kodlamaio.hrms.core.entities.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "employers")
@AllArgsConstructor
@NoArgsConstructor
@Data
@PrimaryKeyJoinColumn(name = "user_id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})
public class Employer extends User {
	
	@NotBlank(message="Bu alan boş geçilemez.")	
	@Column(name = "company_name")
	private String companyName;
	
	@NotBlank(message="Bu alan boş geçilemez.")
	@Column(name = "website")
	private String webSite;
	
	@NotBlank(message="Bu alan boş geçilemez.")
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "is_verified")
	private boolean isVerified;
	
	/*@Column(name = "is_accepted")
	private boolean isAccepted;*/
	
	@OneToMany(mappedBy = "employer")
	List<JobAdvert> jobAdverts;

}
