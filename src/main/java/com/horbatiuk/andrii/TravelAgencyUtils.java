package com.horbatiuk.andrii;

import com.horbatiuk.andrii.dataStorage.AllTravelAgenciesData;
import com.horbatiuk.andrii.utils.ExceptionUtils;

import java.util.Scanner;

/**
 * Created by Andrey on 17.08.2016.
 */
public class TravelAgencyUtils {

    static boolean checkTravelAgencyExistence(String travelAgencyId) {
        ExceptionUtils.checkStringWithExceptions(travelAgencyId);
        return AllTravelAgenciesData.ALL_TRAVEL_AGENCIES_DATA.getTravelAgenciesMap().containsKey(travelAgencyId);
    }

    public static void addPriceRespond(String requestId, String travelAgencyId, int price) {
        ExceptionUtils.checkStringWithExceptions(requestId);
        ExceptionUtils.checkStringWithExceptions(travelAgencyId);

        new PriceResponds(travelAgencyId, requestId, price);
//        @TODO нужен код по добавлению ответа в бд ответов
    }

    public static int getPrice() {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        return price;
    }
}
