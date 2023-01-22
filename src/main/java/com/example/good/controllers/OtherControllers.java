package com.example.good.controllers;

import com.example.good.models.Post;
import com.example.good.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OtherControllers {

    @GetMapping("/cat")
    public String cat(Model model) {
        return "cat";
    }

    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }
}
