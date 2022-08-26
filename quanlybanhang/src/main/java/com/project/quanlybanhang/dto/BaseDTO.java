package com.project.quanlybanhang.dto;

import java.util.Date;

import lombok.Data;

@Data	
public class BaseDTO {

	private Long id;

	private Date createDate;
	
	private Date modifiedDate;
	
	private String createBy;
	
	private String modifiedBy;
}
