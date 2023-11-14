package com.example.BackEnd.Controller;

import com.example.BackEnd.Service.EventService;
import com.example.BackEnd.models.Event;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EventController {
   @Autowired
   private EventService eventService;

    @GetMapping(value = "/events/all", produces = "application/json")
    public List<Event> getAll(){
        return eventService.getAllEvent();
    }

    @GetMapping(value = "/events/id:{id}", produces = "application/json")
    public Event getById(@PathVariable Long id){
        return eventService.getEventById(id);
    }

    @GetMapping(value = "/events/orga:{id_orga}", produces = "application/json")
    public List<Event> getbyIdOrga(@PathVariable int id_orga){
        return eventService.getEventbuIdOrga(id_orga);
    }

    @GetMapping(value = "/events/name:{name}", produces = "application/json")
    public Event getByName(@PathVariable String name){
        return eventService.getEventByName(name);
    }

    @GetMapping(value = "/events/delete:{id}", produces = "application/json")
    public void deleteEventById(@PathVariable Long id){
        eventService.deleteEventById(id);
    }

    @PostMapping(value = "/events/save", produces = "application/json")
    public void saveEventById(@ModelAttribute Event event){
        eventService.saveEvent(event);
    }
}
