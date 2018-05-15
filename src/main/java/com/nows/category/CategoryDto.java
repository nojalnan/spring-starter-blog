package com.nows.category;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class CategoryDto {

	private Long id;
	
	@NotBlank
	private String name;
}