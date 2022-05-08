package com.lee.constructor.extend;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.PhoneBuilder()
                .cpu("AMD")
                .screen("Acer")
                .memory("Kingston")
                .mainboard("Auas")
                .build();
        System.out.println(phone);
    }
}
