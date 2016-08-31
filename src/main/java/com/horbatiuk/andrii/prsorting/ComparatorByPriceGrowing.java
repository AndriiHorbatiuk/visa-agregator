package com.horbatiuk.andrii.prsorting;

import com.horbatiuk.andrii.dataStorage.AllPriceRespondsData;

import java.util.Comparator;

/**
 * Created by Andrey on 31.08.2016.
 */
public class ComparatorByPriceGrowing implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {

        return Integer.compare(AllPriceRespondsData.ALL_PRICE_RESPONDS_DATA.getFromDB(o1).getPrice(),
                AllPriceRespondsData.ALL_PRICE_RESPONDS_DATA.getFromDB(o2).getPrice());
    }
}

