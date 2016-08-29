package com.horbatiuk.andrii;

import com.horbatiuk.andrii.utils.ExceptionUtils;
import com.horbatiuk.andrii.utils.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 19.08.2016.
 */
public class PriceRespondFiltering {

    //Фильтруем по цене

    static void filterByPrice(String requestId, int fromNum, int toNum) {
        ExceptionUtils.checkStringWithExceptions(requestId);
        ExceptionUtils.checkObjectOnNull(PriceRespondUtils.getRespondIdListFromRequestId(requestId));

        List<String> filteredList = new ArrayList<>();
        for (String priceRespondId : PriceRespondUtils.getRespondIdListFromRequestId(requestId)) {
            if (PriceRespondUtils.getPriceRespondObjectFromId(priceRespondId).getPrice() >= fromNum &&
                    PriceRespondUtils.getPriceRespondObjectFromId(priceRespondId).getPrice() <= toNum) {
                filteredList.add(priceRespondId);
            }
        }
        System.out.println(filteredList.toString());    //return
    }

    static void filterTravelAgencyHaveWebSite(String requestId) {
        ExceptionUtils.checkStringWithExceptions(requestId);
        ExceptionUtils.checkObjectOnNull(PriceRespondUtils.getRespondIdListFromRequestId(requestId));

        List<String> filteredList = new ArrayList<>();
        for (String priceRespondId : PriceRespondUtils.getRespondIdListFromRequestId(requestId)) {
            String travelAgencyId = PriceRespondUtils.getPriceRespondObjectFromId(priceRespondId).getTravelAgencyId();
            if (ObjectUtils.isNotNull(TravelAgencyUtils.getTravelAgencyObjectFromId(travelAgencyId).getGetTravelAgencyWebSiteUrl())) {
                filteredList.add(priceRespondId);
            }
        }
        System.out.println(filteredList.toString());    //return
    }
}
