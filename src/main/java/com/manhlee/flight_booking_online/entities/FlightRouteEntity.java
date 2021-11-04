package com.manhlee.flight_booking_online.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "flight_route",  uniqueConstraints=
@UniqueConstraint(columnNames={"departure_id", "destination_id"}))
public class FlightRouteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "hh:mm")
    private Date duration;

    private double price;
    private int distance;

    @ManyToOne()
    @JoinColumn(name = "departure_id")
    private AirportEntity departure;

    @ManyToOne()
    @JoinColumn(name = "destination_id")
    private AirportEntity destination;

    @OneToMany(mappedBy = "flightRoute")
    private List<FlightEntity> flights;

    public FlightRouteEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public AirportEntity getDeparture() {
        return departure;
    }

    public void setDeparture(AirportEntity departure) {
        this.departure = departure;
    }

    public AirportEntity getDestination() {
        return destination;
    }

    public void setDestination(AirportEntity destination) {
        this.destination = destination;
    }

    public List<FlightEntity> getFlights() {
        return flights;
    }

    public void setFlights(List<FlightEntity> flights) {
        this.flights = flights;
    }
}
