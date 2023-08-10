package com.brevio.securingweb.interfaces;

import com.brevio.securingweb.exceptions.BookingException;
import com.brevio.securingweb.models.Booking;

public interface CabBookingService {
    Booking bookRide(String pickUpLocation) throws BookingException;
}
