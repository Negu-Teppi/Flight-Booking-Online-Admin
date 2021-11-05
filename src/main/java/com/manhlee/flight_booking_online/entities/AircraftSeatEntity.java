package com.manhlee.flight_booking_online.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "aircraft_seat")
public class AircraftSeatEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double price;

    @ManyToOne
    @JoinColumn(name = "seat_id")
    private SeatEntity seat;

    @ManyToOne
    @JoinColumn(name = "seat_type_id")
    private SeatTypeEntity seatType;

    @ManyToOne
    @JoinColumn(name = "aircraft_id")
    private AircraftEntity aircraft;

    @ManyToOne
    @JoinColumn(name = "seat_status_id")
    private SeatStatusEntity seatStatus;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private FlightEntity flight;

    public AircraftSeatEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public SeatEntity getSeat() {
        return seat;
    }

    public void setSeat(SeatEntity seat) {
        this.seat = seat;
    }

    public SeatTypeEntity getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatTypeEntity seatType) {
        this.seatType = seatType;
    }

    public AircraftEntity getAircraft() {
        return aircraft;
    }

    public void setAircraft(AircraftEntity aircraft) {
        this.aircraft = aircraft;
    }

    public SeatStatusEntity getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatusEntity seatStatus) {
        this.seatStatus = seatStatus;
    }

    public FlightEntity getFlight() {
        return flight;
    }

    public void setFlight(FlightEntity flight) {
        this.flight = flight;
    }
}
