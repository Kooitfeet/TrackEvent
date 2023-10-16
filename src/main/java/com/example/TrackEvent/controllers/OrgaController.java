package com.example.TrackEvent.controllers;

import com.example.TrackEvent.models.Orga;
import com.example.TrackEvent.services.OrgaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("orga")
@RestController
@RequiredArgsConstructor
public class OrgaController {
    private final OrgaService orgaService;

    @GetMapping("")
    public Orga getById(long id){
        return orgaService.getbyId(id);
    }
    @GetMapping("")
    public List<Orga> getAll(){
        return orgaService.getAll();
    }
}
