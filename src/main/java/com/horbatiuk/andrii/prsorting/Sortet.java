package com.horbatiuk.andrii.prsorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Andrey on 31.08.2016.
 */
public final class Sortet {
    private Sortet() {
    }

    public static <T> List<T> sorter(List<T> list, Comparator<T> cmp){
        Collections.sort(list, cmp);
        return list;
    }
}
