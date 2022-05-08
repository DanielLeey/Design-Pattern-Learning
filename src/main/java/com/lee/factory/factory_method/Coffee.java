package com.lee.factory.factory_method;

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
