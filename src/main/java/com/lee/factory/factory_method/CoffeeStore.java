package com.lee.factory.factory_method;

public class CoffeeStore {

    public CoffeeFactory coffeeFactory;

    //设置factory
    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee offerCoffee() {
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addMilk();
        coffee.addSuger();
        return coffee;
    }
}
