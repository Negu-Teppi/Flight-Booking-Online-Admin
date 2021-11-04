package com.manhlee.flight_booking_online.service;

import com.manhlee.flight_booking_online.entities.CityEntity;
import com.manhlee.flight_booking_online.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<CityEntity> getCities(){
        return (List<CityEntity>) cityRepository.findAll();
    }

    public CityEntity getCity(int id){
        Optional<CityEntity> optional = cityRepository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }
}
