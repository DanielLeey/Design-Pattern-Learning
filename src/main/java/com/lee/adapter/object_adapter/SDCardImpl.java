package com.lee.adapter.object_adapter;

public class SDCardImpl implements SDCard {
    public String readSD() {
        return "SDCard data";
    }

    public void writeSD(String msg) {
        System.out.println("SDCard read: " + msg);
    }
}
