package com.lee.adapter.object_adapter;

/**
 * 只能接收SDCard
 */
public class Computer {

    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd Card can't be null");
        }
        return sdCard.readSD();
    }
}
