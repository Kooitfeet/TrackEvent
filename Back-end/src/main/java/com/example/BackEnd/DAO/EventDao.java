package com.example.BackEnd.DAO;

import com.example.BackEnd.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventDao extends JpaRepository<Event, Long> {
    Event findByID(Long id);
    Event findByName(String name);
    List<Event> findAll();
    void deleteById(Long id);
    Event save(Event event);
}
