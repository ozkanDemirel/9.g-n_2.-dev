package com.kodlamaio.hrms.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.kodlamaio.hrms.entities.concretes.Image;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
	@Column(name = "email")
	private String email;
	
	@NotBlank(message = "Password Alanı Boş Geçilemez")
	@Size(message = "Şifre En az 6 Karakter Uzunluğunda Olmalıdır")
	@Column(name = "password")
	private String password;
	
	@NotBlank(message = "Şifre tekrarı boş olamaz")
	@Column(name = "password_again")
	private String password_again;

	/*@Column(name = "is_verify_email")
	private boolean isVerifyEmail;*/

	@OneToOne(mappedBy = "user")
	private Image image;

	public User(int userId) {
		this.id = userId;
	}


}
