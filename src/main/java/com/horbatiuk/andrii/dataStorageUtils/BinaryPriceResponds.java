package com.horbatiuk.andrii.dataStorageUtils;

import com.horbatiuk.andrii.PriceResponds;
import com.horbatiuk.andrii.dataStorage.AllPriceRespondsData;
import com.horbatiuk.andrii.dataStorage.AllRequestsData;

import java.util.Map;

/**
 * Created by Andrey on 31.08.2016.
 */
public class BinaryPriceResponds implements DataTypeInterface {

    @Override
    public void setMap(Object o) {
        AllPriceRespondsData.ALL_PRICE_RESPONDS_DATA.setMap(o);
    }

    @Override
    public Map<String, PriceResponds> getMap() {
        return AllPriceRespondsData.ALL_PRICE_RESPONDS_DATA.getPriceRespondsMap();
    }
}
