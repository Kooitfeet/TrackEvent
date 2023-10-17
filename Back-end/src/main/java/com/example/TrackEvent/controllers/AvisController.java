package com.example.TrackEvent.controllers;


import com.example.TrackEvent.models.Avis;
import com.example.TrackEvent.services.AvisService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("avis")
@RestController
@RequiredArgsConstructor
public class AvisController {
    private final AvisService avisService;

    @GetMapping("/id")
    public Avis getById(long id){
        return avisService.getById(id);
    }
    @GetMapping("/all")
    public List<Avis> getAll(){
        return avisService.getAll();
    }
}
