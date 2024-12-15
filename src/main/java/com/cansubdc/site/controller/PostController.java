package com.cansubdc.site.controller;

import com.cansubdc.site.entity.Post;
import com.cansubdc.site.service.PostService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public String posts(Model model){
        List<Post> posts = postService.findByUsername("cansuBdc");
        model.addAttribute("posts",posts);
        return "posts";
    }

    @GetMapping("/posts/create")
    public String showCreatePostForm(){
        return "post-create";
    }

    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post){
        postService.createPost(1L,post.getTitle(),post.getDescription(),post.getContent());
        return "redirect:/posts";
    }

    @PostMapping("/posts/{postId}/delete")
    public String deletePost(@PathVariable("postId") Long postId){
        postService.deletePostById(postId);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{postId}/update")
    public String showUpdatePostForm(@PathVariable("postId") Long postId, Model model){
        Post post = postService.getPostById(postId);
        model.addAttribute("post", post);
        return "post-update";
    }

    @PostMapping("/posts/{postId}/update")
    public String updatePost(@PathVariable("postId") Long postId, @ModelAttribute Post post){
        postService.updatePost(postId,post.getTitle(),post.getDescription(),post.getContent());
        return "redirect:/posts";
    }


}
