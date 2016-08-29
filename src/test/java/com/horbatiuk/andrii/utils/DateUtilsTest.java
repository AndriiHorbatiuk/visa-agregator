package com.horbatiuk.andrii.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrey on 29.08.2016.
 */
public class DateUtilsTest {
    @Test
    public void convertMillisecondsToDate() throws Exception {
        Long date = 1472468485063L;
        assertEquals("Date should be: 29/08/2016", "29/08/2016", DateUtils.convertMillisecondsToDate(date));
    }

}