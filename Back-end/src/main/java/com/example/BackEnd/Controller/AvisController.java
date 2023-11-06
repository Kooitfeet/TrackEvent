package com.example.BackEnd.Controller;

import com.example.BackEnd.Service.AvisService;
import com.example.BackEnd.models.Avis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AvisController {
    @Autowired
    private AvisService avisService;

    @GetMapping(value = "/avis/all", produces = "application/json")
    public List<Avis> getAll(){
        return avisService.getAllEvent();
    }
    @GetMapping(value = "/avis/id:{id}", produces = "application/json")
    public Optional<Avis> getById(@PathVariable Long id){
        return avisService.getAvisById(id);
    }
    @GetMapping(value = "/avis/orga:{orga}", produces = "application/json")
    public List<Avis> getByOrga(@PathVariable int orga){
        return avisService.getAvisByOrga(orga);
    }
    @GetMapping(value = "/avis/event:{event}", produces = "application/json")
    public List<Avis> getByEvent(@PathVariable int event){
        return avisService.getAvisByEvent(event);
    }
    @GetMapping(value = "/avis/part:{part}", produces = "application/json")
    public List<Avis> getById(@PathVariable int part){
        return avisService.getAvisByPart(part);
    }
    @GetMapping(value = "/avis/delete:{id}", produces = "application/json")
    public void deleteById(@PathVariable Long id){
        avisService.deleteById(id);
    }
    @PostMapping(value = "/avis/save", produces = "application/json")
    public Avis saveAvis(Avis avis){
        return avisService.saveAvis(avis);

    }
}
