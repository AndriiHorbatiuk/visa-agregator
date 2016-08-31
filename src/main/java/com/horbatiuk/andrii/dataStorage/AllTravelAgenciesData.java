package com.horbatiuk.andrii.dataStorage;

import com.horbatiuk.andrii.TravelAgency;
import com.horbatiuk.andrii.User;

import java.util.Map;

/**
 * Created by Andrey on 31.08.2016.
 */
public enum AllTravelAgenciesData implements DataInterface<TravelAgency> {
    ALL_TRAVEL_AGENCIES_DATA;


    private Map<String, TravelAgency> travelAgenciesData;

    @Override
    public void addToDB(TravelAgency object) {
        travelAgenciesData.put(object.getTravelAgencyEmail(), object);
    }


    @Override
    public TravelAgency getFromDB(String id) {
        return travelAgenciesData.get(id);
    }
}
