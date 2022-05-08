package com.lee.factory.simple_factory;

/**
 * @author Lee
 */
public abstract class Coffee {

    public abstract String getName();

    public void addMilk() {
        System.out.println("add milk");
    }

    public void addSuger() {
        System.out.println("add suger");
    }
}
