package com.horbatiuk.andrii.dataStorage;

import com.horbatiuk.andrii.TravelAgency;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andrey on 17.08.2016.
 */
public final class AllTravelAgencies implements DataInterface<TravelAgency>, Serializable {
    private static final long serialVersionUID = -3765330724073400694L;
    private static Map<String, TravelAgency> allTravelAgenciesMap = new HashMap<>();

    private AllTravelAgencies() {
    }

    public static Map<String, TravelAgency> getAllTravelAgenciesMap() {
        return allTravelAgenciesMap;
    }

    public static void setAllTravelAgenciesMap(Map<String, TravelAgency> allTravelAgenciesMap) {
        com.horbatiuk.andrii.dataStorage.AllTravelAgencies.allTravelAgenciesMap = allTravelAgenciesMap;
    }

    @Override
    public void addToDB(String id, TravelAgency object) {
        AllTravelAgencies.getAllTravelAgenciesMap().put(id, object);
    }

    @Override
    public void getFromDB(String id) {
        AllTravelAgencies.getAllTravelAgenciesMap().get(id);
    }
}
