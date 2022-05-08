package com.lee.adapter.object_adapter;

/**
 * 适配器类：使用成员变量来实现调用
 */
public class SDAdatperTF implements SDCard {
    private TFCard tfCard;

    public SDAdatperTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    public String readSD() {
        System.out.println("adapter read tf card ");
        return tfCard.readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
