package com.trzewik.venueMenagement.menagement;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.trzewik.venueMenagement.model.Venues;
import com.trzewik.venueMenagement.model.venue.VenueItem;

import java.io.IOException;

public class ResponseParser {

    private ObjectMapper mapper;

    public ResponseParser(){
        this.mapper = new ObjectMapper();
    }

    public Venues venuesResponseParser() throws UnirestException, IOException {
        return this.mapper.readValue(ApiClient.getKontaktResponseBody(), Venues.class);
    }

    public VenueItem venueResponseParser() throws UnirestException, IOException {
        return this.mapper.readValue(ApiClient.getKontaktResponseBody(), VenueItem.class);
    }
}
