package com.example.BackEnd.Controller;

import com.example.BackEnd.Service.PublicService;
import com.example.BackEnd.models.Public;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(value = "/public/mail:{mail}", produces = "application/json")
    public Public getByEmail(@PathVariable String mail){
        return publicService.getByEmail(mail);
    }
    @GetMapping(value = "/public/delete:{id}", produces = "application/json")
    public void deleteById(@PathVariable Long id){
        publicService.deleteOrga(id);
    }
    @PostMapping(value = "/public/save", produces = "application/json")
    public Public saveOrga(@RequestBody Public pub){
        return publicService.saveOrga(pub);
    }
    @GetMapping(value = "/public/updateList", produces = "application/json")
    public void updateListParticipe(@RequestParam Long id, @RequestParam List<Integer> list){
        publicService.updateListParticipe(id, list);
    }
}
