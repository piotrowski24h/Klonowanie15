package com.kodilla.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Gdańsk", "Warszawa"));
        flightList.add(new Flight("Warszawa", "Krakow"));
        flightList.add(new Flight("Warszawa", "Praga"));
        FlightBrowser flightBrowser = new FlightBrowser(flightList);

//        for (Flight krakow : flightBrowser.findAllFlightsFromLocation("Krakow")) {
//            System.out.println(krakow);
//        }

//        for (Flight praga : flightBrowser.findAllFlightsToLocation("Praga")) {
//            System.out.println(praga);
//        }

        for (Flight sad : flightBrowser.findAllFlightsWithTransferToLocation("Warszawa")) {
            System.out.println(sad);
        }





    }
}
