package com.lee.adapter.class_adapter;

/**
 * 适配器类：
 */
public class SDAdatperTF extends TFCardImpl implements SDCard {
    public String readSD() {
        System.out.println("adapter read tf card ");
        return readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);    }
}
