package com.example.TrackEvent.services;

import com.example.TrackEvent.DAO.AvisDAO;
import com.example.TrackEvent.models.Avis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvisService {
    @Autowired
    private AvisDAO avisDAO;

    public Avis getById(long id){
        return avisDAO.findById(id);
    }
    public List<Avis> getAll(){
        return avisDAO.findAll();
    }
}
