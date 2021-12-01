package com.sreenu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "USER")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "USER_NAME", length = 50, nullable = false, unique = true)
	private String username;
	@Column(name = "FIRST_NAME", length = 50, nullable = false)
	private String firstname;
	@Column(name = "LAST_NAME", length = 50, nullable = false)
	private String lastname;
	@Column(name = "EMAIL_ADDRESS", length = 50, nullable = false)
	private String email;
	@Column(name = "ROLE", length = 50, nullable = false)
	private String role;
	@Column(name = "SSN", length = 50, nullable = false,unique = true)
	private String ssn;
	

}
