package com.example.BackEnd.DAO;

import com.example.BackEnd.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventDao extends JpaRepository<Event, Long> {
    List<Event> findAll();
}