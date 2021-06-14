package com.blogs.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
	@Id
	private String blogId;
	private String headLine;
	private String body;
	private String conclusion;
	private String category;

}
