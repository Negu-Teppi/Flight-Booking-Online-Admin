package com.manhlee.flight_booking_online.repository;

import com.manhlee.flight_booking_online.entities.AircraftEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AircraftRepository extends CrudRepository<AircraftEntity, Integer> {

}
