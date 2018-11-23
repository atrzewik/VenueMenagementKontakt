package com.trzewik.venueMenagement;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.trzewik.venueMenagement.inputProvider.InputMatcher;
import com.trzewik.venueMenagement.inputProvider.MessagePrinter;
import com.trzewik.venueMenagement.menagement.ApiClient;
import com.trzewik.venueMenagement.menagement.ResponseParser;
import com.trzewik.venueMenagement.model.Venues;
import com.trzewik.venueMenagement.model.venue.VenueItem;
import com.trzewik.venueMenagement.enums.VenueActivity;
import com.trzewik.venueMenagement.inputProvider.MessageProvider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VenueProvider {

    public static void main(String[] args){
        ResponseParser responseParser = new ResponseParser();
        while (true){
            try {
                VenueActivity activityChoice = InputMatcher.collectVenueActivityFromUser(MessageProvider.askAboutActivity);
                switch (activityChoice){
                    case GET_ALL:
                        MessagePrinter.printMessage(getVenues(responseParser).toString());
                        return;
                    case GET:
                        List<VenueItem> venues = getVenues(responseParser);
                        int venuesSize = venues.size()-1;
                        int venueIndex = InputMatcher.collectVenueIndexFromUser(MessageProvider.askAboutIndexActivity + Integer.toString(venuesSize), venuesSize);
                        MessagePrinter.printMessage(venues.get(venueIndex).toString());
                        return;
                    case CREATE:
                        String name = InputMatcher.collectString(MessageProvider.askAboutName);
                        String description = InputMatcher.collectString(MessageProvider.askAboutDescription);
                        ApiClient.createVenue(name, description);
                        return;
                    case DELETE:
                        String id = InputMatcher.collectString(MessageProvider.askAboutVenueId);
                        ApiClient.deleteVenue(id);
                        return;
                    default:
                        throw new IllegalArgumentException();

                }
            }
            catch (UnirestException | IOException e){
                MessagePrinter.printErrorMessage("Illegal argument");
            }
        }
    }

    private static List<VenueItem> getVenues(ResponseParser responseParser) throws IOException, UnirestException {
        Venues venues = responseParser.venuesResponseParser();
        return new ArrayList<>(venues.getVenues());
    }
}
