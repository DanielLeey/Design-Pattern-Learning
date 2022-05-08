package com.lee.adapter.object_adapter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println(computer.readSD(new SDCardImpl()));
        System.out.println("================");
        SDAdatperTF sdAdatperTF = new SDAdatperTF(new TFCardImpl());
        System.out.println(computer.readSD(sdAdatperTF));
    }
}
