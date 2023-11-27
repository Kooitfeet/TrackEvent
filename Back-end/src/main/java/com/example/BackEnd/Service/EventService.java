package com.example.BackEnd.Service;

import com.example.BackEnd.DAO.EventDao;
import com.example.BackEnd.models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    private EventDao eventDao;

    public List<Event> getAllEvent(){
        return eventDao.findAll();
    }
    public Event getEventById(Long id){
        return eventDao.findByID(id);
    }
    public List<Event> getEventbuIdOrga(int id_orga){
        return eventDao.findByOrga(id_orga);
    }
    public Event getEventByName(String name){
        return eventDao.findByName(name);
    }
    public void deleteEventById(Long id){
        eventDao.deleteById(id);
    }
    public Event saveEvent(Event event){
        return eventDao.save(event);
    }
}
