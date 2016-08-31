package com.horbatiuk.andrii;

import com.horbatiuk.andrii.dataStorage.AllUsersData;
import com.horbatiuk.andrii.utils.ExceptionUtils;

/**
 * Created by Andrey on 17.08.2016.
 */
public class UserUtils {

    //Проверяет: существует ли пользователь в общем списке пользователей

    static boolean checkUserExistence(String userId) {
        ExceptionUtils.checkStringWithExceptions(userId);

        return AllUsersData.ALL_USERS_DATA.getUserMap().containsKey(userId);
    }

    //Обработка нового запроса (с проверкой на существование пользователя)
    static void addRequestToUserWithCheckingOfUserExistence(String userEmailInRequest, String requestId) {
        ExceptionUtils.checkStringWithExceptions(userEmailInRequest);
        ExceptionUtils.checkStringWithExceptions(requestId);

        if (checkUserExistence(userEmailInRequest)) {
            addRequestToUser(requestId, userEmailInRequest);
        } else {
            new User(userEmailInRequest);
            addRequestToUser(requestId, userEmailInRequest);
        }
    }

//Добавляет запрос в список запросов пользователя

    static void addRequestToUser(String requestId, String userId) {
        ExceptionUtils.checkStringWithExceptions(userId);
        ExceptionUtils.checkStringWithExceptions(requestId);

        AllUsersData.ALL_USERS_DATA.getFromDB(userId).getUserRequestsIdList().add(requestId);
    }
}
