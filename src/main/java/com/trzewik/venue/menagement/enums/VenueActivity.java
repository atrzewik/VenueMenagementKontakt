package com.trzewik.venue.menagement.enums;

public enum VenueActivity {
    GET,
    GET1,
    CREATE,
    DELETE;

    public static VenueActivity matchActivity(String userChoice){
        for (VenueActivity venueActivity:values()){
            if (userChoice.toUpperCase().equals(venueActivity.name())) {
                return venueActivity;
            }
        }
        throw new IllegalArgumentException("Wrong Activity!");
    }
}
