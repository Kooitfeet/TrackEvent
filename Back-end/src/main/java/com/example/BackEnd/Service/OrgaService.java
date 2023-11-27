package com.example.BackEnd.Service;

import com.example.BackEnd.DAO.OrgaDao;
import com.example.BackEnd.models.Orga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrgaService {
    @Autowired
    private OrgaDao orgaDao;

    public List<Orga> getAllOrga(){
        return orgaDao.findAll();
    }
    public Optional<Orga> getOrgaById(Long id){
        return orgaDao.findById(id);
    }
    public Orga getByPseudo(String pseudo){
        return orgaDao.findByPseudo(pseudo);
    }
    public Orga getByMail(String orga){
        return orgaDao.findByMail(orga);
    }
    public void deleteOrga(Long id){
        orgaDao.deleteById(id);
    }
    public Orga saveOrga(Orga orga){
        return orgaDao.save(orga);
    }
    public void updateList(Long id, List<Integer> newList){
        orgaDao.updateOrganise(id, newList);
    }
}
