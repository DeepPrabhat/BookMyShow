package com.app.bookmyshow.services;

import com.app.bookmyshow.models.Booking;

import java.awt.print.Book;
import java.util.List;

public interface BookingService {
    Booking addBooking(Booking booking);
    List<Booking> getAllBookings();
    Booking getBookingById(Long bookingId);
    Booking deleteBooking(Long bookingId);
}
