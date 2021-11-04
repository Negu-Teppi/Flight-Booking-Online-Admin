package com.manhlee.flight_booking_online.entities;

import com.manhlee.flight_booking_online.enums.TicketType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ticket_type")
public class TicketTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TicketType ticketType;

    @OneToMany(mappedBy = "ticketType")
    private List<BookingDetailEntity> bookingDetails;

    public TicketTypeEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    public List<BookingDetailEntity> getBookingDetails() {
        return bookingDetails;
    }

    public void setBookingDetails(List<BookingDetailEntity> bookingDetails) {
        this.bookingDetails = bookingDetails;
    }
}
