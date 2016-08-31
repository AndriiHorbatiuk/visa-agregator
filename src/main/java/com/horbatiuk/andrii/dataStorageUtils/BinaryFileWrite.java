package com.horbatiuk.andrii.dataStorageUtils;

import java.io.*;
import java.util.Map;

/**
 * Created by Andrey on 31.08.2016.
 */
public final class BinaryFileWrite {
    private BinaryFileWrite() {
    }

    public static <T, E> void writeToBinaryFile(Map<T, E> map, String filepath) {
        try (ObjectOutputStream os = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filepath)))) {
            os.writeObject(map);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
