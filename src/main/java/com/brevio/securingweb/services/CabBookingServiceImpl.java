package com.brevio.securingweb.services;

import com.brevio.securingweb.exceptions.BookingException;
import com.brevio.securingweb.interfaces.CabBookingService;
import com.brevio.securingweb.models.Booking;

import static java.lang.Math.random;
import static java.util.UUID.randomUUID;

public class CabBookingServiceImpl implements CabBookingService {

    @Override public Booking bookRide(String pickUpLocation) throws BookingException {
        if (random() < 0.3) throw new BookingException("Cab unavailable");
        System.out.println(("uhuu passou aqui"));
        return new Booking(randomUUID().toString());
    }


}