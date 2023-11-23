package com.example.BackEnd.DAO;

import com.example.BackEnd.models.Public;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicDao extends JpaRepository<Public, Long> {

    List<Public> findAll();
    Public findByMail(String mail);
    Public findByPseudo(String pseudo);
    void deleteById(Long id);
    Public save(Public pub);
    @Transactional
    @Modifying
    @Query("UPDATE Public p SET p.participe = :newListParti WHERE p.id = :id")
    void updateParticipe(@Param("id") Long id, @Param("newListParti") List<Integer> newListParti);
}
