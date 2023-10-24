package com.example.BackEnd.DAO;

import com.example.BackEnd.models.Avis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AvisDao extends JpaRepository<Avis, Long> {
    List<Avis> findAll();
    void deleteById(Long id);
    Avis save(Avis avis);
}
