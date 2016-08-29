package com.horbatiuk.andrii.dataStorage;

import com.horbatiuk.andrii.Request;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andrey on 17.08.2016.
 */
public final class AllRequests implements DataInterface<Request>, Serializable {
    private static final long serialVersionUID = 7832458871396222148L;
    private static Map<String, Request> allRequestsMap = new HashMap<>();

    private AllRequests() {
    }

    public static Map<String, Request> getAllRequestsMap() {
        return allRequestsMap;
    }

    public static void setAllRequestsMap(Map<String, Request> allRequestsMap) {
        com.horbatiuk.andrii.dataStorage.AllRequests.allRequestsMap = allRequestsMap;
    }

    @Override
    public void addToDB(String id, Request object) {
        AllRequests.getAllRequestsMap().put(id, object);
    }

    @Override
    public void getFromDB(String id) {
        AllRequests.getAllRequestsMap().get(id);
    }
}
