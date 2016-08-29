package com.horbatiuk.andrii;

import com.horbatiuk.andrii.dataStorage.AllRequests;
import com.horbatiuk.andrii.utils.ExceptionUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Andrey on 11.08.2016.
 */
public class Request implements Serializable {
    private static final long serialVersionUID = 4359319404254841971L;
    private String requestCountry;
    private int numberOfPersonsInRequest;
    private long startTripDate;
    private long lastTripDate;
    private String userEmailInRequest;
    private final String requestId;
    private long dateOfRequestCreation;
    private List<String> priceRespondsIdList = new ArrayList<>();

    public Request(String userEmailInRequest) throws NullPointerException, IllegalArgumentException {
        ExceptionUtils.checkStringWithExceptions(userEmailInRequest);
        ExceptionUtils.checkStringIsEmail(userEmailInRequest);

        this.userEmailInRequest = userEmailInRequest;
        requestId = UUID.randomUUID().toString(); //Генерируем рендомный адйи
        dateOfRequestCreation = System.currentTimeMillis(); //Добавляем дату создания заявки
        AllRequests.getAllRequestsMap().put(requestId, this); //Добавляем ссылку на запрос в общее хранилище
        UserUtils.checkUserNewRequest(userEmailInRequest, requestId);  //Проверяем существует ли пользователь с таким email, добавляем
    }

    public Request(String requestId, String userEmailInRequest) throws NullPointerException, IllegalArgumentException {
        ExceptionUtils.checkStringWithExceptions(userEmailInRequest);
        ExceptionUtils.checkStringIsEmail(userEmailInRequest);
        if(RequestUtils.checkRequestExistence(requestId)){
            throw new IllegalArgumentException("Request with id " + requestId + "is already in DB.");
        }
        this.userEmailInRequest = userEmailInRequest;
        this.requestId = requestId; //Используем существующий айди
        dateOfRequestCreation = System.currentTimeMillis(); //Добавляем дату создания заявки
        AllRequests.getAllRequestsMap().put(requestId, this); //Добавляем ссылку на запрос в общее хранилище
        UserUtils.checkUserNewRequest(userEmailInRequest, requestId);  //Проверяем существует ли пользователь с таким email, добавляем
    }

    public String getRequestCountry() {
        return requestCountry;
    }

    public int getNumberOfPersonsInRequest() {
        return numberOfPersonsInRequest;
    }

    public long getStartTripDate() {
        return startTripDate;
    }

    public long getLastTripDate() {
        return lastTripDate;
    }

    public String getUserEmailInRequest() {
        return userEmailInRequest;
    }

    public String getRequestId() {
        return requestId;
    }

    public long getDateOfRequestCreation() {
        return dateOfRequestCreation;
    }

    public List<String> getPriceRespondsIdList() {
        return priceRespondsIdList;
    }

    public void setRequestCountry(String requestCountry) {
        this.requestCountry = requestCountry;
    }

    public void setNumberOfPersonsInRequest(byte numberOfPersonsInRequest) {
        this.numberOfPersonsInRequest = numberOfPersonsInRequest;
    }

    public void setStartTripDate(long startTripDate) {
        this.startTripDate = startTripDate;
    }

    public void setLastTripDate(long lastTripDate) {
        this.lastTripDate = lastTripDate;
    }

    public void setDateOfRequestCreation(long dateOfRequestCreation) {
        this.dateOfRequestCreation = dateOfRequestCreation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        com.horbatiuk.andrii.Request request = (com.horbatiuk.andrii.Request) o;

        if (numberOfPersonsInRequest != request.numberOfPersonsInRequest) return false;
        if (startTripDate != request.startTripDate) return false;
        if (lastTripDate != request.lastTripDate) return false;
        if (dateOfRequestCreation != request.dateOfRequestCreation) return false;
        if (!requestCountry.equals(request.requestCountry)) return false;
        if (!userEmailInRequest.equals(request.userEmailInRequest)) return false;
        return requestId != null ? requestId.equals(request.requestId) : request.requestId == null;

    }

    @Override
    public int hashCode() {
        int result = requestCountry.hashCode();
        result = 31 * result + numberOfPersonsInRequest;
        result = 31 * result + (int) (startTripDate ^ (startTripDate >>> 32));
        result = 31 * result + (int) (lastTripDate ^ (lastTripDate >>> 32));
        result = 31 * result + userEmailInRequest.hashCode();
        result = 31 * result + (requestId != null ? requestId.hashCode() : 0);
        result = 31 * result + (int) (dateOfRequestCreation ^ (dateOfRequestCreation >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestCountry='" + requestCountry + '\'' +
                ", numberOfPersonsInRequest=" + numberOfPersonsInRequest +
                ", startTripDate=" + startTripDate +
                ", lastTripDate=" + lastTripDate +
                ", userEmailInRequest='" + userEmailInRequest + '\'' +
                ", requestId='" + requestId + '\'' +
                ", dateOfRequestCreation=" + dateOfRequestCreation +
                '}';
    }
}
