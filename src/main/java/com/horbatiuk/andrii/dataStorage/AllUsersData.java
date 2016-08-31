package com.horbatiuk.andrii.dataStorage;

import com.horbatiuk.andrii.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andrey on 31.08.2016.
 */
public enum AllUsersData implements DataInterface<User> {
    ALL_USERS_DATA;


    private Map<String, User> userMap = new HashMap<>();

    public Map<String, User> getUserMap() {
        return new HashMap<>(userMap);
    }

    @Override
    public void setMap(Object object) {
        userMap = (Map<String, User>) object;
    }

    @Override
    public void addToDB(User object) {
        userMap.put(object.getUserEmail(), object);
    }


    @Override
    public User getFromDB(String id) {
        return userMap.get(id);
    }
}
