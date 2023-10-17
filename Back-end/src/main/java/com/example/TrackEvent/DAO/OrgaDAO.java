package com.example.TrackEvent.DAO;

import com.example.TrackEvent.models.Orga;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrgaDAO extends JpaRepository<Orga, Long> {
    Orga findById(long id);
    Orga findByPseudo(String pseudo);
    List<Orga> findAll();

}
