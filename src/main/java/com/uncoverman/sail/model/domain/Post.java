package com.uncoverman.sail.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "t_post")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post implements Serializable{

	@Id
	@GeneratedValue
	private Long postId;

	private String postTitle;

	private String postContent;

	private String postContentMd;

	private String postSummary;

	private String postThumbnail;

	private String postUrl;

	private String postStatus;

	private Date postCreateTime;

	private Date postUpdateTime;

	@ManyToMany
	@JoinTable(name = "t_post_category",
			joinColumns = {@JoinColumn(name="post_id")},
			inverseJoinColumns = {@JoinColumn(name = "category_id")})
	private List<Category> categories;

	@ManyToMany
	@JoinTable(name = "t_post_tag",
			joinColumns = {@JoinColumn(name = "post_id")},
			inverseJoinColumns = {@JoinColumn(name="tag_id")})
	private List<Tag> tags;

	@OneToMany(mappedBy = "post")
	private List<Comment> comments;

}
