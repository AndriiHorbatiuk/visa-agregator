package com.horbatiuk.andrii;

import com.horbatiuk.andrii.dataStorage.AllRequestsData;
import com.horbatiuk.andrii.utils.ExceptionUtils;

/**
 * Created by Andrey on 15.08.2016.
 */
public class RequestUtils {

    static boolean checkRequestExistence(String requestId) {
        ExceptionUtils.checkStringOnNull(requestId);
        ExceptionUtils.checkStringOnEmpty(requestId);

        return AllRequestsData.ALL_REQUESTS_DATA.getRequestsMap().containsKey(requestId);
    }

    void sendRequestToTravelAgencies() {
//        Метод отправляет запрос агентствам
    }

    void sendRequestLinkToUser() {
        //Метод отправляет пользователю на почту ссылку на страницу запроса
    }

    void viewRequest() {
//        Пользователь просматривает список ответов на запрос
    }


}
