package com.cansubdc.site.service;

import com.cansubdc.site.entity.Post;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private static List<Post> posts = new ArrayList<Post>();
    private static Long postCount = 0L;

    static{
        posts.add(new Post(++postCount,1L,"Java 101","desc1","test1"));
        posts.add(new Post(++postCount,2L,"Spring 101","desc2","test2"));
        posts.add(new Post(++postCount,3L,"Microservice 101","desc3","test3"));
    }

    public List<Post> findByUsername(String username){

        return posts;
    }

    public void createPost(Long userId, String title, String description, String content){
        posts.add(new Post(++postCount,userId,title,description,content));
    }

}
