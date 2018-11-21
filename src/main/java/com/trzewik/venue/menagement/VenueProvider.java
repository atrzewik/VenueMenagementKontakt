package com.trzewik.venue.menagement;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.trzewik.venue.menagement.inputProvider.InputMatcher;
import com.trzewik.venue.menagement.inputProvider.MessagePrinter;
import com.trzewik.venue.menagement.menagement.ApiClient;
import com.trzewik.venue.menagement.menagement.ResponseParser;
import com.trzewik.venue.menagement.model.Venues;
import com.trzewik.venue.menagement.model.venue.VenueItems;
import com.trzewik.venue.menagement.enums.VenueActivity;
import com.trzewik.venue.menagement.inputProvider.MessageProvider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VenueProvider {

    public static void main(String[] args){
        ResponseParser responseParser = new ResponseParser();
        while (true){
            try {
                VenueActivity activityChoice = InputMatcher.collectVenueActivityFromUser(MessageProvider.askAboutActivity);
                if (activityChoice.equals(VenueActivity.GET)){
                    MessagePrinter.printMessage(getVenues(responseParser).toString());
                    return;
                }
                else if(activityChoice.equals(VenueActivity.GET1)){
                    List<VenueItems> venues = getVenues(responseParser);
                    int venuesSize = venues.size()-1;
                    int venueIndex = InputMatcher.collectVenueIndexFromUser(MessageProvider.askAboutIndexActivity + Integer.toString(venuesSize), venuesSize);
                    MessagePrinter.printMessage(venues.get(venueIndex).toString());
                    return;
                }
                else if (activityChoice.equals(VenueActivity.CREATE)){
                    String name = InputMatcher.collectString(MessageProvider.askAboutName);
                    String description = InputMatcher.collectString(MessageProvider.askAboutDescription);
                    ApiClient.createVenue(name, description);
                    return;
                }
                else if (activityChoice.equals(VenueActivity.DELETE)){
                    String id = InputMatcher.collectString(MessageProvider.askAboutVenueId);
                    ApiClient.deleteVenue(id);
                    return;
                }
            }
            catch (UnirestException | IOException e){
                MessagePrinter.printErrorMessage("Illegal argument");
            }
        }
    }

    private static List<VenueItems> getVenues(ResponseParser responseParser) throws IOException, UnirestException {
        Venues venues = responseParser.venuesResponseParser();
        return new ArrayList<>(venues.getVenues());
    }
}
