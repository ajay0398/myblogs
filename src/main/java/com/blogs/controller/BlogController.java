package com.blogs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blogs.pojo.Blog;
import com.blogs.repository.BlogRepository;

@RestController
@RequestMapping("/blogs")
public class BlogController {

	@Autowired
	private BlogRepository blogRepository;

	@PostMapping
	public Blog add(@RequestBody Blog blog) {
		return blogRepository.save(blog);

	}

	@GetMapping
	public List<Blog> findAll() {
		return blogRepository.findAll();

	}

	@DeleteMapping("blogId")
	public void deleteById(@RequestParam String blogId) {
		blogRepository.deleteById(blogId);

	}

}
