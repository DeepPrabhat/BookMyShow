package com.app.bookmyshow.services;

import com.app.bookmyshow.models.Movie;
import com.app.bookmyshow.models.Multiplex;

import java.util.List;

public interface MultiplexService {
    Multiplex addMultiplex(Multiplex multiplex);
    List<Multiplex> getAllMultiplex();
    Multiplex getMultiplexById(Long multiplexId);
    Multiplex deleteMultiplex(Long multiplexId);
}
