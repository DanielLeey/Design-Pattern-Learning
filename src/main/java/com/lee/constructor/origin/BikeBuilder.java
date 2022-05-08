package com.lee.constructor.origin;

/**
 * 自行车建造抽象类
 */
public abstract class BikeBuilder {

        //生产的自行车产品
        protected Bike bike = new Bike();

        //生产车架
        public abstract void buildFrame();

        //生产车座
        public abstract void buildSeat();

        //生产自行车
        public abstract Bike createBike();
}
