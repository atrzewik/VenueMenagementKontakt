package com.trzewik.venue.menagement.model.venue;

import com.trzewik.venue.menagement.model.venue.venueItems.Metadata;
import com.trzewik.venue.menagement.model.venue.venueItems.Shares;

import java.math.BigDecimal;
import java.util.List;

public class VenueItems {

    private String image;
    private Metadata metadata;
    private String address;
    private String access;
    private int devicesCount;
    private BigDecimal lng;
    private String description;
    private String managerId;
    private List<Shares> shares;
    private String coverType;
    private String name;
    private String id;
    private BigDecimal lat;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public int getDevicesCount() {
        return devicesCount;
    }

    public void setDevicesCount(int devicesCount) {
        this.devicesCount = devicesCount;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public List<Shares> getShares() {
        return shares;
    }

    public void setShares(List<Shares> shares) {
        this.shares = shares;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }
}
