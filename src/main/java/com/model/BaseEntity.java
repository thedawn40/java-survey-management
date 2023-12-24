package com.model;

import java.util.Date;

import lombok.Data;

@Data
public class BaseEntity {
	

	private Date createdDate = new Date();
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	

}
