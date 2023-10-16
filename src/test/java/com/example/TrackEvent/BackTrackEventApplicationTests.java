package com.example.TrackEvent;

import com.example.TrackEvent.models.Event;
import com.example.TrackEvent.services.EventService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackTrackEventApplicationTests {
	@Autowired
	private EventService eventService;
	@Test
	void contextLoads() {
		Event event = eventService.getById(2L);
		System.out.println(event.getName());
	}

}
