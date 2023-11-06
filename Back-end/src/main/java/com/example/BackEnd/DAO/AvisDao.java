package com.example.BackEnd.DAO;

import com.example.BackEnd.models.Avis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AvisDao extends JpaRepository<Avis, Long> {
    List<Avis> findAll();
    void deleteById(Long id);
    Avis save(Avis avis);
    @Query("SELECT e FROM Avis e WHERE e.id_orga = :orga")
    List<Avis> findByOrga(@Param("orga") int orga);
    @Query("SELECT e FROM Avis e WHERE e.id_event = :event")
    List<Avis> findByEvent(@Param("event") int event);
    @Query("SELECT e FROM Avis e WHERE e.id_part = :part")
    List<Avis> findByPart(@Param("part") int part);
}
