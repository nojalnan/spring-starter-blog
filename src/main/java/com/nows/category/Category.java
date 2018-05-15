package com.nows.category;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.nows.post.Post;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
@ToString(exclude = { "post" })
@EqualsAndHashCode(exclude = { "post" })
public class Category implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private LocalDateTime regDate;

	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
	private List<Post> post = new ArrayList<>();

	Category() {
	}

	public Category(Long id) {
		this.id = id;
	}

	public Category(Long id, String name) {
		this.name = name;
		this.id = id;
	}
}