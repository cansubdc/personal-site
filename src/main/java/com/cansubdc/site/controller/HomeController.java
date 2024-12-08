package com.cansubdc.site.controller;

import com.cansubdc.site.entity.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    public record HomePage(String title, String descr){}

    List<Post> posts = new ArrayList<>();

    @GetMapping("/")
    private String getHomePage(Model model){
        model.addAttribute("homePage", new HomePage("Home","Welcome to Site"));
        model.addAttribute("posts", posts);
        return "home";
    }

}

