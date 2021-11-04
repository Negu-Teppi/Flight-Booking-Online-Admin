package com.manhlee.flight_booking_online.entities;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "airport")
public class AirportEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100, nullable = false, name = "name")
    private String airportName;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "city_id")
    private CityEntity city;

    @OneToMany(mappedBy = "airport", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ImageEntity> image;

    @OneToMany(mappedBy = "departure")
    private List<FlightRouteEntity> departureFlightRoutes;

    @OneToMany(mappedBy = "destination")
    private List<FlightRouteEntity> destinationFlightRoutes;

    @Transient
    private List<MultipartFile> files;

    public AirportEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public CityEntity getCity() {
        return city;
    }

    public void setCity(CityEntity city) {
        this.city = city;
    }

    public List<ImageEntity> getImage() {
        return image;
    }

    public void setImage(List<ImageEntity> image) {
        this.image = image;
    }

    public List<FlightRouteEntity> getDepartureFlightRoutes() {
        return departureFlightRoutes;
    }

    public void setDepartureFlightRoutes(List<FlightRouteEntity> departureFlightRoutes) {
        this.departureFlightRoutes = departureFlightRoutes;
    }

    public List<FlightRouteEntity> getDestinationFlightRoutes() {
        return destinationFlightRoutes;
    }

    public void setDestinationFlightRoutes(List<FlightRouteEntity> destinationFlightRoutes) {
        this.destinationFlightRoutes = destinationFlightRoutes;
    }

    public List<MultipartFile> getFiles() {
        return files;
    }

    public void setFiles(List<MultipartFile> files) {
        this.files = files;
    }
}
