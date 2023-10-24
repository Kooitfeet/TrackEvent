package com.example.BackEnd.Controller;

import com.example.BackEnd.Service.OrgaService;
import com.example.BackEnd.models.Orga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class OrgaController {
    @Autowired
    private OrgaService orgaService;

    @GetMapping(value = "/orga/all", produces = "application/json")
    public List<Orga> getAll(){
        return orgaService.getAllOrga();
    }
    @GetMapping(value = "/orga/id:{id}", produces = "application/json")
    public Optional<Orga> getById(@PathVariable Long id){
        return orgaService.getOrgaById(id);
    }
    @GetMapping(value = "/orga/pseudo:{pseudo}", produces = "application/json")
    public Orga getByPseudo(@PathVariable String pseudo){
        return orgaService.getByPseudo(pseudo);
    }
    @GetMapping(value = "/orga/delete:{id}", produces = "application/json")
    public void deleteById(@PathVariable Long id){
        orgaService.deleteOrga(id);
    }
    @GetMapping(value = "/orga/save", produces = "application/json")
    public Orga saveOrga(Orga orga){
        return orgaService.saveOrga(orga);
    }
}
