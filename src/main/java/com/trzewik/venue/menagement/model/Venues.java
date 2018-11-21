package com.trzewik.venue.menagement.model;

import com.trzewik.venue.menagement.model.venue.SearchMeta;
import com.trzewik.venue.menagement.model.venue.VenueItems;

import java.util.List;

public class Venues {

    private List<VenueItems> venues;
    private SearchMeta searchMeta;

    public List<VenueItems> getVenues() {
        return venues;
    }

    public void setVenues(List<VenueItems> venues) {
        this.venues = venues;
    }

    public SearchMeta getSearchMeta() {
        return searchMeta;
    }

    public void setSearchMeta(SearchMeta searchMeta) {
        this.searchMeta = searchMeta;
    }
}
