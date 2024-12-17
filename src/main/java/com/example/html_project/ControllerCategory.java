package com.example.html_project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerCategory {
    @GetMapping("/coupe")
    public String coupe() {
        return "categoryCoupe";
    }



}