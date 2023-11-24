package com.example.BackEnd.Controller;

import com.example.BackEnd.Service.OrgaService;
import com.example.BackEnd.models.Orga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OrgaController {
    @Autowired
    private OrgaService orgaService;

    @GetMapping(value = "/orga/all", produces = "application/json")
    public List<Orga> getAll() {
        return orgaService.getAllOrga();
    }

    @GetMapping(value = "/orga/id:{id}", produces = "application/json")
    public Optional<Orga> getById(@PathVariable Long id) {
        return orgaService.getOrgaById(id);
    }

    @GetMapping(value = "/orga/pseudo:{pseudo}", produces = "application/json")
    public Orga getByPseudo(@PathVariable String pseudo) {
        return orgaService.getByPseudo(pseudo);
    }

    @GetMapping(value = "/orga/mail:{mail}", produces = "application/json")
    public Orga getByMail(@PathVariable String mail) {
        return orgaService.getByMail(mail);
    }

    @GetMapping(value = "/orga/delete:{id}", produces = "application/json")
    public void deleteById(@PathVariable Long id) {
        orgaService.deleteOrga(id);
    }

    @GetMapping(value = "/orga/save", produces = "application/json")
    public Orga saveOrga(Orga orga) {
        return orgaService.saveOrga(orga);
    }

    @GetMapping(value = "/orga/updateList", produces = "application/json")
    public void updateListOrga(@RequestParam Long id, @RequestParam List<Integer> list) {
        orgaService.updateList(id, list);
    }
}
