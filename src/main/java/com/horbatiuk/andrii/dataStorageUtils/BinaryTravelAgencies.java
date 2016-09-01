package com.horbatiuk.andrii.dataStorageUtils;

import com.horbatiuk.andrii.TravelAgency;
import com.horbatiuk.andrii.dataStorage.AllTravelAgenciesData;
import com.horbatiuk.andrii.dataStorage.AllUsersData;

import java.util.Map;

/**
 * Created by Andrey on 31.08.2016.
 */
public class BinaryTravelAgencies implements DataTypeInterface {

    @Override
    public void setMap(Object o) {
        AllTravelAgenciesData.ALL_TRAVEL_AGENCIES_DATA.setMap(o);
    }

    @Override
    public Map<String, TravelAgency> getMap() {
        return AllTravelAgenciesData.ALL_TRAVEL_AGENCIES_DATA.getTravelAgenciesMap();
    }
}
