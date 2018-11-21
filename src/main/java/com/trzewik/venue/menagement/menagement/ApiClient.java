package com.trzewik.venue.menagement.menagement;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class ApiClient {

    public static String getKontaktResponseBody() throws UnirestException {
        return Unirest.get(DataProvider.venueUrl)
                .queryString("Access", DataProvider.access)
                .header("Api-Key", DataProvider.apiKey)
                .header("Accept", DataProvider.accept)
                .asString()
                .getBody();
    }

    public static void createVenue(String name, String ... description) throws UnirestException {
        Unirest.post(DataProvider.createVenueUrl)
                .header("Api-Key", DataProvider.apiKey)
                .header("Content-Type", DataProvider.contentType)
                .header("Accept", DataProvider.accept)
                .field("name", name)
                .field("description", description)
                .asJson();

    }

    public static void deleteVenue(String venueId) throws UnirestException {
        Unirest.post(DataProvider.deleteVenueUrl)
                .header("Api-Key", DataProvider.apiKey)
                .header("Content-Type", DataProvider.contentType)
                .header("Accept", DataProvider.accept)
                .field("venueId", venueId)
                .asJson();
    }
}
