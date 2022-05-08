package com.lee.constructor.origin;

public class MobikeBuilder extends BikeBuilder {
    @Override
    public void buildFrame() {
        super.bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        super.bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return super.bike;
    }
}
