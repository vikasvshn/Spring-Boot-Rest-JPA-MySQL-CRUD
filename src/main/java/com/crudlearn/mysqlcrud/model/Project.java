package com.crudlearn.mysqlcrud.model;

import java.util.Date;

import lombok.Data;

@Data
public class Project {
	
	private int id;
	private String projectName;
	private String  description;
	private Date startDate;
	private Date endDate;
	private boolean status;
	private Date createdOn;
	private Date updatedOn;

}
