package com.lee.adapter.class_adapter;

public class TFCardImpl implements TFCard {
    public String readTF() {
        return "TFCard data";
    }

    public void writeTF(String msg) {
        System.out.println("TFCard read: " + msg);
    }
}
