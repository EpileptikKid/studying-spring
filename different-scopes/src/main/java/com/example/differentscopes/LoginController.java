package com.example.differentscopes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String loginGet() {
        return "login.html";
    }

    @PostMapping("/")
    public String loginPost(
            LoginProcessor loginProcessor,
            Model model) {
        boolean loggedIn = loginProcessor.login();
        if (loggedIn) {
            model.addAttribute("message", "You are now logged in.");
        } else {
            model.addAttribute("message", "Login failed!");
        }

        return "login.html";
    }
}
