package com.askie01.recipeapp.controller;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Data
@Controller
public class HomeController {

    @GetMapping(path = "home")
    public String getHomePage() {
        return "home";
    }
}