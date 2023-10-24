package com.example.BackEnd.DAO;

import com.example.BackEnd.models.Orga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrgaDao extends JpaRepository<Orga, Long> {
    List<Orga> findAll();
    Orga findByPseudo(String pseudo);
    void deleteById(Long id);
    Orga save(Orga orga);
}
