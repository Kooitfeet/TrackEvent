package com.example.TrackEvent.DAO;

import com.example.TrackEvent.models.Public;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicDAO extends JpaRepository<Public, Long> {
    Public findByPseudo(String pseudo);
    Public findById(long id);
    List<Public> findAll();
}
