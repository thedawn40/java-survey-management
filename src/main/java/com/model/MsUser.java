package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ms_user")
public class MsUser extends BaseEntity {
	
	@Id
	private String username;
	
	private String email;
	private String password;
	private String isActive;
	private String refferalId;
	private String refferalCode;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getRefferalId() {
		return refferalId;
	}
	public void setRefferalId(String refferalId) {
		this.refferalId = refferalId;
	}
	public String getRefferalCode() {
		return refferalCode;
	}
	public void setRefferalCode(String refferalCode) {
		this.refferalCode = refferalCode;
	}

}
