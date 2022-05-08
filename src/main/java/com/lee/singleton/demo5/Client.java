package com.lee.singleton.demo5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Singleton> clazz = Singleton.class;
        Constructor<Singleton> cons = clazz.getDeclaredConstructor();
        cons.setAccessible(true);
        Singleton singleton = cons.newInstance();
        Singleton singleton2 = cons.newInstance();
        System.out.println(singleton == singleton2);
    }
}
