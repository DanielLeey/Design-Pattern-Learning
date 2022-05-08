package com.lee.proxy.jdk_proxy;

/**
 * @author Lee
 * 真实主题
 */
public class TrainStation implements SellTicks {
    public void sell() {
        System.out.println("火车票卖票");
    }
}
