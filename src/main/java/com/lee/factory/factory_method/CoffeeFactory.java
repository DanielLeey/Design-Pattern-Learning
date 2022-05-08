package com.lee.factory.factory_method;

/**
 * 工厂方法：
 *      接口，使用实现类产生对应的bean
 * @author Lee
 */
public interface CoffeeFactory {

    //制作Coffee
    public Coffee createCoffee();
}
