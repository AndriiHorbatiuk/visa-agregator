package com.horbatiuk.andrii.utils;

/**
 * Created by Andrey on 27.08.2016.
 */
public class NumUtils {

    public static boolean isLong(String num){
        try{
            Long.parseLong(num);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public static boolean isInt(String num){
        try{
            Integer.parseInt(num);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
