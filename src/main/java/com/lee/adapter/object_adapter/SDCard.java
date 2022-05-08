package com.lee.adapter.object_adapter;

/**
 * 目标类：通过适配器类，去适应
 */
public interface SDCard {

    public String readSD();

    public void writeSD(String msg);
}
