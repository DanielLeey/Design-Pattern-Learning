package com.lee.constructor.origin;

/**
 * 指挥者类：
 *      指定具体Builder类，设置创建步骤
 */
public class BikeDirector {

    private  BikeBuilder bikeBuilder;

    public BikeDirector(BikeBuilder bikeBuilder) {
        this.bikeBuilder = bikeBuilder;
    }

    public Bike construct() {
        bikeBuilder.buildFrame();
        bikeBuilder.buildSeat();
        return bikeBuilder.createBike();
    }

}
