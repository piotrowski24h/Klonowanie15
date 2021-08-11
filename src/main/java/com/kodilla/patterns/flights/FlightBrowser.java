package com.kodilla.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightBrowser {
    private List<Flight> flights;

    public FlightBrowser(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> findAllFlightsFromLocation(String startLocation) {
        return flights.stream()
                .filter(flight -> flight.getStartLocation().equals(startLocation))
                .collect(Collectors.toList());
    }

    public List<Flight> findAllFlightsToLocation(String endLocation) {
        return flights.stream()
                .filter(flight -> flight.getEndLocation().equals(endLocation))
                .collect(Collectors.toList());
    }

    public List<Flight> findAllFlightsWithTransferToLocation(String transferLocation) {
        List<Flight> list = findAllFlightsToLocation(transferLocation);
        List<Flight> list1 = findAllFlightsFromLocation(transferLocation);

//        list1.parallelStream()
//                .collect(Collectors.toCollection(()-> list));
//
        list.addAll(list1);


        return list;
    }
}
