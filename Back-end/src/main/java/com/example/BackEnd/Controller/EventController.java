package com.example.BackEnd.Controller;

import com.example.BackEnd.Service.EventService;
import com.example.BackEnd.models.Event;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// mvn spring-boot:run

@RestController
public class EventController {
   @Autowired
   private EventService eventService;
    @GetMapping(value = "/events/all", produces = "application/json")
    public List<Event> getAll(){
        return eventService.getAllEvent();
    }
}
