package com.example.BackEnd.Service;

import com.example.BackEnd.DAO.PublicDao;
import com.example.BackEnd.models.Public;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublicService {
    @Autowired
    private PublicDao publicDao;

    public List<Public> getAllOrga(){
        return publicDao.findAll();
    }
    public Optional<Public> getOrgaById(Long id){
        return publicDao.findById(id);
    }
    public Public getByEmail(String mail){
        return publicDao.findByMail(mail);
    }
    public Public getByPseudo(String pseudo){
        return publicDao.findByPseudo(pseudo);
    }
    public void deleteOrga(Long id){
        publicDao.deleteById(id);
    }
    public Public saveOrga(Public pub){
        return publicDao.save(pub);
    }
    public void updateListParticipe(Long id, List<Integer> newList){
        publicDao.updateParticipe(id, newList);
    }
}
