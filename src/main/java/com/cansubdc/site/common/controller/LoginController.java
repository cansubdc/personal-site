package com.cansubdc.site.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    public record LoginPage(String title, String descr){}

    @GetMapping("/login")
    private String getLoginPage(Model model){
        model.addAttribute("loginPage", new LoginPage("Login","Welcome to Login"));
        return "login";
    }

}
