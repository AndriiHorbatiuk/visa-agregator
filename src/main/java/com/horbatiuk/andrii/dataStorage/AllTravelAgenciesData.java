package com.horbatiuk.andrii.dataStorage;

import com.horbatiuk.andrii.TravelAgency;
import com.horbatiuk.andrii.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andrey on 31.08.2016.
 */
public enum AllTravelAgenciesData implements DataInterface<TravelAgency> {
    ALL_TRAVEL_AGENCIES_DATA;


    private Map<String, TravelAgency> travelAgenciesMap = new HashMap<>();

    public Map<String, TravelAgency> getTravelAgenciesMap() {
        return new HashMap<>(travelAgenciesMap);
    }

    @Override
    public void setMap(Object object) {
        travelAgenciesMap = (Map<String, TravelAgency>) object;
    }

    @Override
    public void addToDB(TravelAgency object) {
        travelAgenciesMap.put(object.getTravelAgencyEmail(), object);
    }


    @Override
    public TravelAgency getFromDB(String id) {
        return travelAgenciesMap.get(id);
    }
}
