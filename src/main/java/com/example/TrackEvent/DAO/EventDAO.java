package com.example.TrackEvent.DAO;

import com.example.TrackEvent.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EventDAO extends JpaRepository<Event, Long> {
    Event findByID(Long id);
}
