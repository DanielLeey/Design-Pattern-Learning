package com.lee.proxy.static_proxy;

/**
 * 代理类，增强真实主题
 */
public class ProxyPoint implements SellTicks {

    public TrainStation trainStation = new TrainStation();


    public void sell() {
        System.out.println("代售点收取手续费");
        trainStation.sell();
    }
}
