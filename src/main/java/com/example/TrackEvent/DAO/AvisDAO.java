package com.example.TrackEvent.DAO;

import com.example.TrackEvent.models.Avis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AvisDAO extends JpaRepository<Avis, Long> {
    Avis findById(long id);
    List<Avis> findAll();
}
