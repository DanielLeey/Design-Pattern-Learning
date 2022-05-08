package com.lee.adapter.class_adapter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println(computer.readSD(new SDCardImpl()));
        System.out.println("================");
        System.out.println(computer.readSD(new SDAdatperTF()));
    }
}
