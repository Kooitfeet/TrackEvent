package com.example.TrackEvent.DAO;

import com.example.TrackEvent.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventDAO extends JpaRepository<Event, Long> {
}
