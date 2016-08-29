package com.horbatiuk.andrii.dataStorage;

import com.horbatiuk.andrii.User;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andrey on 17.08.2016.
 */
public final class AllUsers implements DataInterface<User>, Serializable {
    private static final long serialVersionUID = 2270591637074953797L;
    private static Map<String, User> allUsersMap = new HashMap<>();

    private AllUsers() {
    }

    public static Map<String, User> getAllUsersMap() {
        return allUsersMap;
    }

    public static void setAllUsersMap(Map<String, User> allUsersMap) {
        com.horbatiuk.andrii.dataStorage.AllUsers.allUsersMap = allUsersMap;
    }

    @Override
    public void addToDB(String id, User object) {
        AllUsers.getAllUsersMap().put(id, object);
    }

    @Override
    public void getFromDB(String id) {
        AllUsers.getAllUsersMap().get(id);
    }
}
