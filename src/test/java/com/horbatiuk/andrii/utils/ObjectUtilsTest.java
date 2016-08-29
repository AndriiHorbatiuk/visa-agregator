package com.horbatiuk.andrii.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrey on 29.08.2016.
 */
public class ObjectUtilsTest {
    @Test
    public void isNotNullFalse() throws Exception {
        assertEquals("Should be false", false, ObjectUtils.isNotNull(null));
    }

    @Test
    public void isNotNullTrue() throws Exception {
        assertEquals("Should be true", true, ObjectUtils.isNotNull(new String("notNullString")));
    }

}