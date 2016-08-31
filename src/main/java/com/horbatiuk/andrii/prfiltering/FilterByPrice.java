package com.horbatiuk.andrii.prfiltering;

import com.horbatiuk.andrii.PriceResponds;

/**
 * Created by Andrey on 31.08.2016.
 */
public class FilterByPrice implements FilterInterface<PriceResponds> {

    private int fromNum;
    private int toNum;

    public FilterByPrice(int fromNum, int toNum) {
        this.fromNum = fromNum;
        this.toNum = toNum;
    }

    @Override
    public boolean apply(PriceResponds obj) {
        if (obj.getPrice() <= fromNum && obj.getPrice() >= toNum) {
            return false;
        }
        return true;
    }
}
