package com.lee.proxy.jdk_proxy;

public class Client {
    public static void main(String[] args) {
        JDKProxyFactory jdkProxyFactory = new JDKProxyFactory();
        SellTicks proxy = jdkProxyFactory.getProxy();
        proxy.sell();
    }
}
