package com.cansubdc.site.post.service;

import com.cansubdc.site.post.dto.PostCreateRequest;
import com.cansubdc.site.post.entity.Post;
import com.cansubdc.site.post.repository.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;
    private static final Logger log = LoggerFactory.getLogger(PostService.class);


    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> findByUsername(String username){
        return postRepository.findAll();
    }

    public void createPost(PostCreateRequest postCreateRequest){
        postRepository.save(new Post(postCreateRequest.title(),postCreateRequest.description(),postCreateRequest.content()));
    }

    public Post getPostById(Long id){
        var p = postRepository.findAll().stream().filter(post -> post.getId().equals(id)).findFirst().orElse(null);
        log.debug("p" + p);
        return p;
    }

    public void deletePostById(Long id){
        Post post = getPostById(id);
        post.delete();
        postRepository.delete(post);
    }

    public void updatePost(Long id, String title, String description, String content){
        Post post = getPostById(id);
        post.update(title, description, content);
    }

}
