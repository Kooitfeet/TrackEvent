package com.example.BackEnd.DAO;

import com.example.BackEnd.models.Orga;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrgaDao extends JpaRepository<Orga, Long> {
    List<Orga> findAll();
    Orga findByPseudo(String pseudo);
    Orga findByMail(String mail);
    void deleteById(Long id);
    Orga save(Orga orga);
    @Transactional
    @Modifying
    @Query("UPDATE Orga o SET o.organise = :newListOrga WHERE o.id = :id")
    void updateOrganise(@Param("id") Long id, @Param("newListOrga") List<Integer> newListOrga);
}
