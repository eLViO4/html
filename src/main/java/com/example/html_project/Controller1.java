package com.example.html_project;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller1 {
    /*@GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("/FavouritePlaces")
    public String favouritePlaces() {
        return "FavouritePlaces";
    }*/
    @GetMapping("/")
    public String home() {
        return "intershop";
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
    @GetMapping("/myPage")
    public String myPage() {
        return "myPage";
    }

}