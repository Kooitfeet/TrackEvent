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
}
