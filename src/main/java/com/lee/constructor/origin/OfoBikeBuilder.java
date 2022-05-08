package com.lee.constructor.origin;

public class OfoBikeBuilder extends BikeBuilder {
    @Override
    public void buildFrame() {
        super.bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        super.bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return super.bike;
    }
}
