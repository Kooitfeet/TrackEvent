package com.example.TrackEvent.controllers;

import com.example.TrackEvent.models.Event;
import com.example.TrackEvent.services.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("events")
@RestController
@RequiredArgsConstructor
public class EventController {
    private final EventService eventService;

    @GetMapping("")
    public Event getbyId(Long ID){
        return eventService.getById(ID);
    }
    @GetMapping("")
    public List<Event> getAll(){
        return eventService.getAllEvent();
    }
    @GetMapping("")
    public Event getByName(String name){
        return eventService.getByname(name);
    }
}
