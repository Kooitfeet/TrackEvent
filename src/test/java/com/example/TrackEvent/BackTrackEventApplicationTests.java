package com.example.TrackEvent;

import com.example.TrackEvent.models.Event;
import com.example.TrackEvent.services.EventService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BackTrackEventApplicationTests {
	@Autowired
	private EventService eventService;
	@Test
	void contextLoads() {

        Event event = new Event();

		event.setID(7);
		event.setId_orga(3);
		event.setId_part(5);
		event.setName("TestName");
		event.setTheme("testhème");
		event.setLieu("testlieu");
		event.setDate("10/10/2023");
		event.setPrix(10);
		event.setDescription("TestDesc");
		event.setAffiche("urlImage");

		eventService.addEvent(event);

		System.out.println("Test le fichier test");
	}

}
