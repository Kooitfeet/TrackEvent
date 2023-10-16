package com.example.TrackEvent.services;

import com.example.TrackEvent.DAO.OrgaDAO;
import com.example.TrackEvent.models.Orga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgaService {
    @Autowired
    private OrgaDAO orgaDao;

    public Orga getbyId(long id){
        return orgaDao.findById(id);
    }
    public List<Orga> getAll(){
        return orgaDao.findAll();
    }
}
