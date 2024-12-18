package com.example.html_project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerCategory {
    @GetMapping("/coupe")
    public String coupe() {
        return "categoryCoupe";
    }
    @GetMapping("/sedan")
    public String sedan() {
        return "categorySedan";
    }
    @GetMapping("/pickup")
    public String pickup() {
        return "categoryPickup";
    }
    @GetMapping("/hatchback")
    public String hatchback() {
        return "categoryHatchback";
    }
    @GetMapping("/suv")
    public String SUV() {
        return "categorySUV";
    }



}