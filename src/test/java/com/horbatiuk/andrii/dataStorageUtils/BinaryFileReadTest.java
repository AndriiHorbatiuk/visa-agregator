package com.horbatiuk.andrii.dataStorageUtils;

import com.horbatiuk.andrii.dataStorage.AllUsersData;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrey on 31.08.2016.
 */
public class BinaryFileReadTest {
    @Test
    public void readFromBinaryFile() throws Exception {
        assertEquals("Проверяем пользоветелей. Должен быть 0.", 0, AllUsersData.ALL_USERS_DATA.getUserMap().size());
        BinaryFileRead.readFromBinaryFile("AllUsers_new.txt", new BinaryUsers());
        assertEquals("Проверяем пользоветелей. Должно стать 202", 202, AllUsersData.ALL_USERS_DATA.getUserMap().size());
    }

}