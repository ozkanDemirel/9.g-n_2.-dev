package com.kodlamaio.hrms.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public  class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Email
	@NotBlank(message = "Email Alanı Boş Geçilemez")
	@NotNull(message = "Email Alanı Null Olamaz")
	@Column(name = "email")
	private String email;
	
	@NotBlank(message = "Password Alanı Boş Geçilemez")
	@NotNull(message = "Password Alanı Null Olamaz")
	@Min(value = 6, message = "Şifre En az 6 Karakter Uzunluğunda Olmalıdır")
	@Column(name = "password")
	private String password;
	
	//private String rePassword;


}
