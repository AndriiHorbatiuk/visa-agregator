package com.horbatiuk.andrii.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrey on 29.08.2016.
 */
public class NumUtilsTest {
    @Test
    public void isLongFalse() throws Exception {
        String num = "05g45";
        assertEquals("Should be false", false, NumUtils.isLong(num));
    }

    @Test
    public void isLongTrue() throws Exception {
        String num = "15";
        assertEquals("Should be true", true, NumUtils.isLong(num));
    }

    @Test
    public void isIntFalse() throws Exception {
        String num = "05g45";
        assertEquals("Should be false", false, NumUtils.isInt(num));
    }

    @Test
    public void isIntTrue() throws Exception {
        String num = "42";
        assertEquals("Should be true", true, NumUtils.isInt(num));
    }


}