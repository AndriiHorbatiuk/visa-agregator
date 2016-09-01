package com.horbatiuk.andrii.dataStorageUtils;

import com.horbatiuk.andrii.User;
import com.horbatiuk.andrii.dataStorage.AllPriceRespondsData;
import com.horbatiuk.andrii.dataStorage.AllTravelAgenciesData;
import com.horbatiuk.andrii.dataStorage.AllUsersData;

import java.util.Map;

/**
 * Created by Andrey on 31.08.2016.
 */
public class BinaryUsers implements DataTypeInterface {

    @Override
    public void setMap(Object o) {
        AllUsersData.ALL_USERS_DATA.setMap(o);
    }

    @Override
    public Map<String, User> getMap() {
        return AllUsersData.ALL_USERS_DATA.getUserMap();
    }
}
