package com.example.TrackEvent.services;

import com.example.TrackEvent.DAO.EventDAO;
import com.example.TrackEvent.models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @Autowired
    private EventDAO eventDAO;

    public Event getById(Long ID) {
        return eventDAO.findByID(ID);
    }
}
