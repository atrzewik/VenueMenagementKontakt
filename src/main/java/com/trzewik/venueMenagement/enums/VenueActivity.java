package com.trzewik.venueMenagement.enums;

public enum VenueActivity {
    GET_ALL,
    GET,
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
