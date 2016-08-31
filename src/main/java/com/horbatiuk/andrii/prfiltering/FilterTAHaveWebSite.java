package com.horbatiuk.andrii.prfiltering;

import com.horbatiuk.andrii.PriceResponds;
import com.horbatiuk.andrii.dataStorage.AllTravelAgenciesData;
import com.horbatiuk.andrii.utils.StringUtils;

/**
 * Created by Andrey on 31.08.2016.
 */
public class FilterTAHaveWebSite implements FilterInterface<PriceResponds> {


    @Override
    public boolean apply(PriceResponds obj) {
        return StringUtils.isNotEmpty(
                AllTravelAgenciesData.ALL_TRAVEL_AGENCIES_DATA.getFromDB(obj.getTravelAgencyId())
                        .getGetTravelAgencyWebSiteUrl());
    }
}
