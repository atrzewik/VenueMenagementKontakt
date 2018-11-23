package com.trzewik.venueMenagement.menagement;


public class DataProvider {

    private static String basicUrl = "https://api.kontakt.io/";
    public static String venueUrl = basicUrl+"venue/";
    public static String createVenueUrl = venueUrl+"create/";
    public static String deleteVenueUrl = venueUrl+"delete";
    public static String apiKey  = ApiKeyProperty.getApiKey();
    public static String accept = "application/vnd.com.kontakt+json;version=10";
    public static String access ="OWNER";
    public static String contentType = "application/x-www-form-urlencoded; charset=utf-8";

}
