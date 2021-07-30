package com.spring.christianblog.service;

import com.spring.christianblog.model.Post;

import java.util.List;

public interface ChristianblogService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);

}
