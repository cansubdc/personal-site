package com.cansubdc.site.entity;

import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public class Post {

    private Long id;
    private Long userId;
    private String title;
    private String description;
    private String content;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime publishedAt;
    private LocalDateTime updatedAt;


    public Post(Long id, Long userId, String title, String description, String content) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.content = content;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getContent() {
        return content;
    }

    public void update (String title, String description, String content){
        this.title = title;
        this.description = description;
        this.content = content;
        this.updatedAt = LocalDateTime.now();
    }

    public void delete (){
        this.status = "DELETED";
    }

}
