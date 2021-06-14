package com.blogs.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.blogs.pojo.Blog;

@Repository
public interface BlogRepository extends MongoRepository<Blog, String> {

}
