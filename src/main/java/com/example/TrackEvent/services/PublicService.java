package com.example.TrackEvent.services;

import com.example.TrackEvent.DAO.PublicDAO;
import com.example.TrackEvent.models.Public;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicService {
    @Autowired
    private PublicDAO publicDao;

    public Public getByName(String name){
        return publicDao.findByPseudo(name);
    }
    public Public getById(long id){
        return publicDao.findById(id);
    }
}
