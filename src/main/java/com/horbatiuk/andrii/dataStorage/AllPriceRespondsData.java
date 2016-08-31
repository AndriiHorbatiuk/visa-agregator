package com.horbatiuk.andrii.dataStorage;

import com.horbatiuk.andrii.PriceResponds;
import com.horbatiuk.andrii.User;

import java.util.Map;

/**
 * Created by Andrey on 31.08.2016.
 */
public enum AllPriceRespondsData implements DataInterface<PriceResponds> {
    ALL_PRICE_RESPONDS_DATA;


    private Map<String, PriceResponds> priceRespondsMap;

    @Override
    public void addToDB(PriceResponds object) {
        priceRespondsMap.put(object.getPriceRespondId(), object);
    }


    @Override
    public PriceResponds getFromDB(String id) {
        return priceRespondsMap.get(id);
    }
}
