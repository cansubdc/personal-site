package com.cansubdc.site.entity;

import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public class Post {

    private Long id;
    private Long userId;
    private String title;
    private String description;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime publishedAt;
    private LocalDateTime updatedAt;


    public Post(Long id, Long userId, String title, String description, String content) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.content = content;
        this.createdAt = createdAt;
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
}
