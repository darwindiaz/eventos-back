package com.bvc.eventos.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bvc.eventos.models.EventModel;

@Repository
public interface EventRepository extends CrudRepository<EventModel, Long> {

    public abstract ArrayList<EventModel> findByOrigin(String origin);
}
