package com.brevio.securingweb.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import static java.lang.String.format;

@Getter
@Setter
public class Booking implements Serializable {
    private String bookingCode;

    public Booking(String bookingCode) {
        System.out.println("Booking constructor call");

        this.bookingCode = bookingCode;
    }

    @Override
    public String toString() {
        return format("Ride confirmed: code '%s'.", bookingCode);
    }
}
