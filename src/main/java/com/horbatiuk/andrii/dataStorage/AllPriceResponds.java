package com.horbatiuk.andrii.dataStorage;

import com.horbatiuk.andrii.PriceResponds;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andrey on 19.08.2016.
 */
public final class AllPriceResponds implements DataInterface<PriceResponds>, Serializable {

    private static final long serialVersionUID = 6169497914097508729L;
    private static Map<String, PriceResponds> allPriceRespondsMap = new HashMap<>();

    private AllPriceResponds() {
    }

    public static Map<String, PriceResponds> getAllPriceRespondsMap() {
        return allPriceRespondsMap;
    }

    public static void setAllPriceRespondsMap(Map<String, PriceResponds> allPriceRespondsMap) {
        com.horbatiuk.andrii.dataStorage.AllPriceResponds.allPriceRespondsMap = allPriceRespondsMap;
    }

    public static void addPriceRespondToDB(String s, PriceResponds pr) {

    }

    @Override
    public void addToDB(String id, PriceResponds object) {
        AllPriceResponds.getAllPriceRespondsMap().put(id, object);
    }

    @Override
    public void getFromDB(String id) {
        AllPriceResponds.getAllPriceRespondsMap().get(id);
    }
}
