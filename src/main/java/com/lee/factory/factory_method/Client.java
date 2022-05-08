package com.lee.factory.factory_method;

public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        LatteCoffeeFactory latteCoffeeFactory = new LatteCoffeeFactory();
        coffeeStore.setCoffeeFactory(latteCoffeeFactory);
        Coffee coffee = coffeeStore.offerCoffee();
        System.out.println(coffee.getName());
    }
}
