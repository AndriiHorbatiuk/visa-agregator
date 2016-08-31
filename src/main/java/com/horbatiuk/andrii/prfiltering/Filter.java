package com.horbatiuk.andrii.prfiltering;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 31.08.2016.
 */
public final class Filter {
    private Filter() {
    }

    public static <T> List<T> filter(List<T> values, FilterInterface<T> filterInterface) {
        List<T> result = new ArrayList<T>();

        for (T value : values) {
            if (filterInterface.apply(value)) {
                result.add(value);
            }
        }

        return result;
    }
}
