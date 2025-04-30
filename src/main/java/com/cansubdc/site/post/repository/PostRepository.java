package com.cansubdc.site.post.repository;

import com.cansubdc.site.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>  {

    public List<Post> findByUsername(String title);
}
