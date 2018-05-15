package com.nows.comment;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class CommentDto {

	@NotNull
	private Long postId;

	@NotBlank
	private String content;
}
