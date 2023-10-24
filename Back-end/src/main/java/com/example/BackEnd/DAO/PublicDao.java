package com.example.BackEnd.DAO;

import com.example.BackEnd.models.Public;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicDao extends JpaRepository<Public, Long>  {
    List<Public> findAll();
    Public findByPseudo(String pseudo);
    void deleteById(Long id);
    Public save(Public pub);
}
