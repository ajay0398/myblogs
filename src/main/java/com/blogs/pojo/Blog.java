package com.blogs.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

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
	@NonNull
	private String headLine;
	@NonNull
	private String body;
	@NonNull
	private String conclusion;
	@NonNull
	private String category;

}
