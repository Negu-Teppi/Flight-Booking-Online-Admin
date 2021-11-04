package com.manhlee.flight_booking_online.service;

import com.manhlee.flight_booking_online.entities.FlightRouteEntity;
import com.manhlee.flight_booking_online.repository.FlightRouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightRouteService {

    @Autowired
    private FlightRouteRepository flightRouteRepository;

    public List<FlightRouteEntity> getFlightRoutes(){
        return (List<FlightRouteEntity>) flightRouteRepository.findAll();
    }

    public void save(FlightRouteEntity flightRoute){
        flightRouteRepository.save(flightRoute);
    }

    public FlightRouteEntity getFlightRoute(int id){
        Optional<FlightRouteEntity> optional =  flightRouteRepository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    public void deleteFlightRoute(int id){
        flightRouteRepository.deleteById(id);
    }
}
