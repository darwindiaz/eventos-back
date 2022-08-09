package com.bvc.eventos.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bvc.eventos.models.EventModel;
import com.bvc.eventos.repositories.EventRepository;

@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;

    public ArrayList<EventModel> getEvents() {
        return (ArrayList<EventModel>) eventRepository.findAll();
    }

    public EventModel saveEvent(EventModel event) {
        return eventRepository.save(event);
    }

    public ArrayList<EventModel> getByOrigin(Integer origin) {
        return eventRepository.findByOrigin(origin);
    }
}
