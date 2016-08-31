package com.horbatiuk.andrii.dataStorage;

import com.horbatiuk.andrii.PriceResponds;

/**
 * Created by Andrey on 29.08.2016.
 */
public interface DataInterface<T> {
    void addToDB(T object);

    T getFromDB(String id);
}
