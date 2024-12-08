package com.cansubdc.site.controller;

import com.cansubdc.site.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class LoginController {

    private AuthenticationService authService;

    @Autowired
    public LoginController(AuthenticationService authService) {
        this.authService = authService;
    }

    public record LoginPage(String title, String descr){}

    @GetMapping("/login")
    private String getLoginPage(Model model){
        model.addAttribute("loginPage", new LoginPage("Login","Welcome to Login"));
        return "login";
    }

    @PostMapping("/login")
    private String login(@RequestParam String username, @RequestParam String password, Model model) {
        if(authService.authenticate(username,password)){
            return "redirect:/posts";
        }
        model.addAttribute("loginPage", new LoginPage("Login","Welcome to Login"));
        model.addAttribute("errorMessage","Invalid Credentials! Please try again.");
        return "login";
    }

}
