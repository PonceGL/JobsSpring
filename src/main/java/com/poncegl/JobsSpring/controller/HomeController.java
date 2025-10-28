package com.poncegl.JobsSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        String name = "FrontEnd Developer";
        Date date = new Date();
        double salary = 1500.00;
        boolean available = true;

        model.addAttribute("name", name);
        model.addAttribute("date", date);
        model.addAttribute("salary", salary);
        model.addAttribute("available", available);
        return "home";
    }
}
