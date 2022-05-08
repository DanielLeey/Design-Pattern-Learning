package com.lee.factory.simple_factory;

public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.offerCoffee("latte");
        System.out.println(coffee.getName());

    }
}
