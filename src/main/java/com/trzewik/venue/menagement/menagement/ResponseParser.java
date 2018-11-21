package com.trzewik.venue.menagement.menagement;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.trzewik.venue.menagement.model.Venues;
import com.trzewik.venue.menagement.model.venue.VenueItems;

import java.io.IOException;

public class ResponseParser {

    private ObjectMapper mapper;

    public ResponseParser(){
        this.mapper = new ObjectMapper();
    }

    public Venues venuesResponseParser() throws UnirestException, IOException {
        return this.mapper.readValue(ApiClient.getKontaktResponseBody(), Venues.class);
    }

    public VenueItems venueResponseParser() throws UnirestException, IOException {
        return this.mapper.readValue(ApiClient.getKontaktResponseBody(), VenueItems.class);
    }
}
