package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
 
    @GetMapping("/index")
    public String getInternationalPage() {
        return "index";
    }
}