package com.example.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.Retention;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home() {
        return "home.html";
    }
}
