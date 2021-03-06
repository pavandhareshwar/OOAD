package com.cub.springbootstarter.profile;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profile {

	/* Attributes */
	private String name;
	@Id
	private String email;
	private String password;
	private String mobile;
	
	/* Default Constructor */
	public Profile() {
		
	}
	
	/* Overloaded constructor */
	public Profile(String name, String email, String password, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	}
	/* Getters and Setters */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
