package com.nows.post;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.nows.category.Category;
import com.nows.comment.Comment;
import com.nows.user.User;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
@ToString(exclude = { "category", "comments" })
@EqualsAndHashCode(exclude = { "category", "comments" })
public class Post {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	private String title;

	@Lob
	@NotNull
	private String content;

	@Lob
	private String code;

	@Enumerated(EnumType.STRING)
	private PostStatus status;

	private LocalDateTime regDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CATEGORY_ID")
	private Category category;

	@OneToMany(mappedBy = "post", fetch = FetchType.LAZY)
	private List<Comment> comments;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID")
	private User user;

	Post() {
	}

	public Post(Long id) {
		this.id = id;
	}

	public Post(String title, PostStatus status) {
		this.title = title;
		this.status = status;
	}

	public Post(Long id, String title, String content, String code, PostStatus status) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.code = code;
		this.status = status;
	}

	public Post(String title, String content, String code, PostStatus status) {
		this.title = title;
		this.content = content;
		this.code = code;
		this.status = status;
	}

	public Post(String title, String content, String code, PostStatus status, Category category, User user) {
		this.title = title;
		this.content = content;
		this.code = code;
		this.status = status;
		this.category = category;
		this.user = user;
	}
}
