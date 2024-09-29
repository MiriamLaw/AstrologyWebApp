package com.coderscampus.SpringSecurityJWTDemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showHomePage() {
        return "home";  // Refers to home.html template
    }
}
