package com.horbatiuk.andrii.dataStorageUtils;

import com.horbatiuk.andrii.Request;
import com.horbatiuk.andrii.dataStorage.AllRequestsData;
import com.horbatiuk.andrii.dataStorage.DataInterface;

import java.util.Map;

/**
 * Created by Andrey on 31.08.2016.
 */
public class BinaryRequests implements DataTypeInterface {

    @Override
    public void setMap(Object o) {
        AllRequestsData.ALL_REQUESTS_DATA.setMap(o);
    }
}
