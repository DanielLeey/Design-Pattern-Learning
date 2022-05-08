package com.lee.factory.simple_factory;

public class CoffeeStore {

    public Coffee offerCoffee(String type) {
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSuger();
        return coffee;
    }

}
