package com.manhlee.flight_booking_online.service;

import com.manhlee.flight_booking_online.entities.AircraftEntity;
import com.manhlee.flight_booking_online.repository.AircraftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AircraftService {

    @Autowired
    private AircraftRepository aircraftRepository;

    public List<AircraftEntity> getAircrafts(){
        return (List<AircraftEntity>) aircraftRepository.findAll();
    }

    public AircraftEntity getAircraft(int id){
        Optional<AircraftEntity> optional = aircraftRepository.findById(id);
        if(optional.isPresent()){
            return  optional.get();
        }
        return null;
    }

    public void save(AircraftEntity aircraft){
        aircraftRepository.save(aircraft);
    }

    public void deleteAircraft(int id){
        aircraftRepository.deleteById(id);
    }
}
