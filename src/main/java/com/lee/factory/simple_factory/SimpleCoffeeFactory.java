package com.lee.factory.simple_factory;

/**
 * 简单工厂
 *
 * 静态工厂
 */
public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else {
            throw new RuntimeException("没有此品种咖啡");
        }
        return coffee;
    }
}
