package com.janki.jokesapp.controllers;

import com.janki.jokesapp.services.jokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jokeController {
    private final com.janki.jokesapp.services.jokeService jokeService;

    public jokeController(jokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJokes(Model model){
        model.addAttribute(jokeService.getJoke());

        return "index";
    }
}
