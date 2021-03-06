package com.uncoverman.sail.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Table(name = "t_category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category implements Serializable{

	@Id
	@GeneratedValue
	private Long categoryId;

	@NotEmpty(message = "分类不能为空")
	private String categoryName;
}
