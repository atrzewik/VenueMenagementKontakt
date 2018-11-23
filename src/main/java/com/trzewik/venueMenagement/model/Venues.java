package com.trzewik.venueMenagement.model;

import com.trzewik.venueMenagement.model.venue.SearchMeta;
import com.trzewik.venueMenagement.model.venue.VenueItem;

import java.util.List;

public class Venues {

    private List<VenueItem> venues;
    private SearchMeta searchMeta;

    public List<VenueItem> getVenues() {
        return venues;
    }

    public void setVenues(List<VenueItem> venues) {
        this.venues = venues;
    }

    public SearchMeta getSearchMeta() {
        return searchMeta;
    }

    public void setSearchMeta(SearchMeta searchMeta) {
        this.searchMeta = searchMeta;
    }
}
