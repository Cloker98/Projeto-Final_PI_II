package com.spring.christianblog.repository;

import com.spring.christianblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChristianblogRepository extends JpaRepository<Post, Long> {
}
