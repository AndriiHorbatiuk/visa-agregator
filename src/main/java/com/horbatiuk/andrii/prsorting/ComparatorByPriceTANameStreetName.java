package com.horbatiuk.andrii.prsorting;

import com.horbatiuk.andrii.dataStorage.AllPriceRespondsData;
import com.horbatiuk.andrii.dataStorage.AllTravelAgenciesData;

import java.util.Comparator;

/**
 * Created by Andrey on 31.08.2016.
 */
public class ComparatorByPriceTANameStreetName implements Comparator<String> {
    public int compare(String o1, String o2) {
        int result;
        String travelAgencyId1 = AllPriceRespondsData.ALL_PRICE_RESPONDS_DATA.getFromDB(o1).getTravelAgencyId();
        String travelAgencyId2 = AllPriceRespondsData.ALL_PRICE_RESPONDS_DATA.getFromDB(o2).getTravelAgencyId();
        result = Integer.compare(AllPriceRespondsData.ALL_PRICE_RESPONDS_DATA.getFromDB(o1).getPrice(),
                AllPriceRespondsData.ALL_PRICE_RESPONDS_DATA.getFromDB(o2).getPrice());
        if (result == 0) {
            result = AllTravelAgenciesData.ALL_TRAVEL_AGENCIES_DATA.getFromDB(travelAgencyId1).getTravelAgencyName().compareTo(
                    AllTravelAgenciesData.ALL_TRAVEL_AGENCIES_DATA.getFromDB(travelAgencyId2).getTravelAgencyName()
            );
            if (result == 0) {
                result = AllTravelAgenciesData.ALL_TRAVEL_AGENCIES_DATA.getFromDB(travelAgencyId1).getTravelAgencyStreet().compareTo(
                        AllTravelAgenciesData.ALL_TRAVEL_AGENCIES_DATA.getFromDB(travelAgencyId2).getTravelAgencyStreet());
            }
        }
        return result;
    }
}

