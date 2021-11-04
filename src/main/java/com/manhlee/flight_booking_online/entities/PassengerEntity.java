package com.manhlee.flight_booking_online.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "passenger")
public class PassengerEntity extends Personal implements Serializable {

    @Column(length = 25)
    private String identCode;

    public PassengerEntity() {
    }

    public String getIdentCode() {
        return identCode;
    }

    public void setIdentCode(String identCode) {
        this.identCode = identCode;
    }
}
