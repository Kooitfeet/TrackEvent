package com.example.BackEnd.Service;


import com.example.BackEnd.DAO.AvisDao;
import com.example.BackEnd.models.Avis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvisService {
    @Autowired
    private AvisDao avisDao;

    public List<Avis> getAllEvent(){
        return avisDao.findAll();
    }
    public Optional<Avis> getAvisById(Long id){
        return avisDao.findById(id);
    }
    public void deleteById(Long id){
        avisDao.deleteById(id);
    }
    public Avis saveAvis(Avis avis){
        return avisDao.save(avis);
    }
}
