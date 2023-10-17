package com.example.TrackEvent.controllers;

import com.example.TrackEvent.models.Public;
import com.example.TrackEvent.services.PublicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("public")
@RestController
@RequiredArgsConstructor
public class PublicController {
    private final PublicService publicService;

    @GetMapping("/name")
    public Public getByName(String Name){
        return publicService.getByName(Name);
    }
    @GetMapping("/id")
    public Public getById(long id){
        return publicService.getById(id);
    }
}
