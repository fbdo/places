package com.github.fbdo.places;


import com.github.fbdo.appengine.guice.geocoder.GeoCoordinate;

public interface PlacesAPIClient {

    PlaceResponse getResults(GeoCoordinate geo, int radiusInMeters);

    PlaceResponse getResults(String nextPageToken);

}
