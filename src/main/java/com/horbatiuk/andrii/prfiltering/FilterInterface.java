package com.horbatiuk.andrii.prfiltering;

/**
 * Created by Andrey on 31.08.2016.
 */
public interface FilterInterface<T> {
    boolean apply(T obj);
}
