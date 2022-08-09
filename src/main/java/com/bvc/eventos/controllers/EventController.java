package com.bvc.eventos.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bvc.eventos.models.EventModel;
import com.bvc.eventos.services.EventService;

@RestController
@RequestMapping("/eventos")
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping()
    public ArrayList<EventModel> getEvents() {
        return eventService.getEvents();
    }

    @PostMapping()
    public EventModel saveEvent(@RequestBody EventModel event) {
        return eventService.saveEvent(event);
    }

    @GetMapping("/buscar")
    public ArrayList<EventModel> getEventsByOrigin(@RequestParam("origin") Integer origin) {
        return eventService.getByOrigin(origin);
    }

}
