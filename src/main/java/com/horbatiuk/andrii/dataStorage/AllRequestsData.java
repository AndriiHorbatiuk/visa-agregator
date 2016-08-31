package com.horbatiuk.andrii.dataStorage;

import com.horbatiuk.andrii.Request;
import com.horbatiuk.andrii.User;

import java.util.Map;

/**
 * Created by Andrey on 31.08.2016.
 */
public enum AllRequestsData implements DataInterface<Request> {
    ALL_REQUESTS_DATA;


    private Map<String, Request> requestsMap;

    @Override
    public void addToDB(Request object) {
        requestsMap.put(object.getRequestId(), object);
    }


    @Override
    public Request getFromDB(String id) {
        return requestsMap.get(id);
    }
}
