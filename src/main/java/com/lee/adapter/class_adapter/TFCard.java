package com.lee.adapter.class_adapter;

/**
 * 适配者接口：需要被适配
 */
public interface TFCard {

    public String readTF();

    public void writeTF(String msg);
}
