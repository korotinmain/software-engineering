package com.korotin;

import java.time.LocalTime;

public class Train {

    private String destination;
    private LocalTime time;
    private Places places;
    private int number;

    Train(String destination, LocalTime time, Places places, int number) {
        this.destination = destination;
        this.places = places;
        this.number = number;
        this.time = time;
    }

    public Places getPlaces() {
        return places;
    }

    public String getDestination() {
        return destination;
    }

    public LocalTime getTime() {
        return time;
    }

    public int getNumber() { return number; }
}
