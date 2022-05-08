package com.lee.constructor.origin;

public class Client {
    public static void main(String[] args) {
        BikeDirector bikeDirector = new BikeDirector(new MobikeBuilder());
        Bike bike = bikeDirector.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }

}
