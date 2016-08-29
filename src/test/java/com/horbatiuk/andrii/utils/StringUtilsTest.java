package com.horbatiuk.andrii.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrey on 29.08.2016.
 */
public class StringUtilsTest {
    @Test
    public void isNotNullTrue() throws Exception {
        assertEquals("Should be true", true, StringUtils.isNotNull("notNullString"));
    }

    @Test
    public void isNotNullFalse() throws Exception {
        assertEquals("Should be false", false, StringUtils.isNotNull(null));
    }

    @Test
    public void isNotEmptyTrue() throws Exception {
        assertEquals("Should be true", true, StringUtils.isNotEmpty("notEmptyString"));
    }

    @Test
    public void isNotEmptyFalse() throws Exception {
        assertEquals("Should be false", false, StringUtils.isNotEmpty(""));
    }

    @Test
    public void isEmailTrue() throws Exception {
        assertEquals("Should be true", true, StringUtils.isEmail("email@adr.com"));
    }

    @Test
    public void isEmailFalseWithoutDomainZone() throws Exception {
        assertEquals("Should be false", false, StringUtils.isEmail("email@adr."));
    }

    @Test
    public void isEmailFalseWithoutNameOfMailbox() throws Exception {
        assertEquals("Should be false", false, StringUtils.isEmail("@adr.com"));
    }

}