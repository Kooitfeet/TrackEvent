package com.example.BackEnd.Controller;

import com.example.BackEnd.Service.PublicService;
import com.example.BackEnd.models.Public;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PublicController {
    @Autowired
    private PublicService publicService;

    @GetMapping(value = "/public/all", produces = "application/json")
    public List<Public> getAll(){
        return publicService.getAllOrga();
    }
    @GetMapping(value = "/public/id:{id}", produces = "application/json")
    public Optional<Public> getById(@PathVariable Long id){
        return publicService.getOrgaById(id);
    }
    @GetMapping(value = "/public/pseudo:{pseudo}", produces = "application/json")
    public Public getByPseudo(@PathVariable String pseudo){
        return publicService.getByPseudo(pseudo);
    }
    @GetMapping(value = "/public/delete:{id}", produces = "application/json")
    public void deleteById(@PathVariable Long id){
        publicService.deleteOrga(id);
    }
    @GetMapping(value = "/public/save", produces = "application/json")
    public Public saveOrga(Public pub){
        return publicService.saveOrga(pub);
    }
}
