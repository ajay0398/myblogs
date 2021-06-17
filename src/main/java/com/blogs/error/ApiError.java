package com.blogs.error;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import lombok.Data;

/**
 * @author Ganesh Mahato
 * @since 2021
 *
 */
@Data
public class ApiError {
	private int status;
	private String message;
	private long timestamp;
	private String path;
	Map<String, String> validationError = new HashMap<String, String>();

	public ApiError(int status, String message, String path) {
		super();
		this.status = status;
		this.message = message;
		this.path = path;
		this.timestamp = new Date().getTime();
	}

}
