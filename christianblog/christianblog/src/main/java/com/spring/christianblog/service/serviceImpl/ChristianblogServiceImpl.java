package com.spring.christianblog.service.serviceImpl;

import com.spring.christianblog.model.Post;
import com.spring.christianblog.repository.ChristianblogRepository;
import com.spring.christianblog.service.ChristianblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChristianblogServiceImpl implements ChristianblogService {

    @Autowired
    ChristianblogRepository christianblogRepository;

    @Override
    public List<Post> findAll() {
        return christianblogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return christianblogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return christianblogRepository.save(post);
    }
}
