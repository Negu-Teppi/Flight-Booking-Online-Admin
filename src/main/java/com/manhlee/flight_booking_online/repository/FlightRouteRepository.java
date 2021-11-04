package com.manhlee.flight_booking_online.repository;

import com.manhlee.flight_booking_online.entities.FlightRouteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRouteRepository extends CrudRepository<FlightRouteEntity, Integer> {
}
