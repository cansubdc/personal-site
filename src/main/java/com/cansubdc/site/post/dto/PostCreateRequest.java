package com.cansubdc.site.post.dto;

public record PostCreateRequest (
        String title,
        String description,
        String content
) {

}
