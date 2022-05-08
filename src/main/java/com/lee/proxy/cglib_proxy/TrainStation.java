package com.lee.proxy.cglib_proxy;

/**
 * 没有接口去动态代理，只用实现类需要增强
 */
public class TrainStation {
    public void sell() {
        System.out.println("火车站卖票");
    }
}
