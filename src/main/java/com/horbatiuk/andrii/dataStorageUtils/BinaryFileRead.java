package com.horbatiuk.andrii.dataStorageUtils;

import com.horbatiuk.andrii.dataStorage.DataInterface;

import java.io.*;
import java.util.Map;

/**
 * Created by Andrey on 31.08.2016.
 */
public final class BinaryFileRead {
    private BinaryFileRead() {
    }

    public static <T,E> void readFromBinaryFile(String filepath, DataTypeInterface dti){
        try (ObjectInputStream os = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filepath)))) {
            dti.setMap(os.readObject());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
