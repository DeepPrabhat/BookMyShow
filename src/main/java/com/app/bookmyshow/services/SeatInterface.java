package com.app.bookmyshow.services;

import com.app.bookmyshow.models.Screen;
import com.app.bookmyshow.models.Seat;

import java.util.List;

public interface SeatInterface {
    Seat addScreen(Seat seat);
    List<Seat> getAllSeat();
    Seat getSeatById(Long seatId);
    Seat deleteSeat(Long seatId);
}
