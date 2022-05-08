package com.lee.strategy;

public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
        System.out.println("===================================");
        salesMan.setStrategy(new StrategyB());
        salesMan.salesManShow();
        System.out.println("===================================");
        salesMan.setStrategy(new StrategyC());
        salesMan.salesManShow();
    }
}
