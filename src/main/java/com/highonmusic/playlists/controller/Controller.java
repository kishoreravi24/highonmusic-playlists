package com.highonmusic.playlists.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/playlists")
public class Controller {
    @GetMapping("/")
    public String test(){
        return "Hello, from playlists microservice";
    }
}
