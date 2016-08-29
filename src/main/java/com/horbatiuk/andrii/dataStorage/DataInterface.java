package com.horbatiuk.andrii.dataStorage;

/**
 * Created by Andrey on 29.08.2016.
 */
public interface DataInterface<T> {
    void addToDB (String id, T object);
    void getFromDB (String id);
}
