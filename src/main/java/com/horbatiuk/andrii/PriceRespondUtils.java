package com.horbatiuk.andrii;

import com.horbatiuk.andrii.dataStorage.AllPriceRespondsData;
import com.horbatiuk.andrii.dataStorage.AllRequestsData;
import com.horbatiuk.andrii.utils.ExceptionUtils;

import java.util.List;

/**
 * Created by Andrey on 19.08.2016.
 */
public class PriceRespondUtils {
    public static List<String> getRespondIdListFromRequestId(String requestId) {
        ExceptionUtils.checkStringWithExceptions(requestId);
        ExceptionUtils.checkObjectOnNull(AllRequestsData.ALL_REQUESTS_DATA.getFromDB(requestId));
        ExceptionUtils.checkObjectOnNull(AllRequestsData.ALL_REQUESTS_DATA.getFromDB(requestId).getPriceRespondsIdList());

        return AllRequestsData.ALL_REQUESTS_DATA.getFromDB(requestId).getPriceRespondsIdList();
    }

    public static boolean isRespondFromTravelAgency(String travelAgencyId, String requestId) {
        List<String> listOfResponds = AllRequestsData.ALL_REQUESTS_DATA.getFromDB(requestId).getPriceRespondsIdList();
        for (String s : listOfResponds) {
            if (AllPriceRespondsData.ALL_PRICE_RESPONDS_DATA.getFromDB(s).getTravelAgencyId().equals(travelAgencyId)) {
                return true;
            }
        }
        return false;
    }
}

