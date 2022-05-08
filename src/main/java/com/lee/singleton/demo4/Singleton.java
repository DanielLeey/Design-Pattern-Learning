package com.lee.singleton.demo4;

/**
 * 懒汉式：
 *      静态内部类
 *
 */
public class Singleton {
    //1. 私有构造器
    private Singleton() { }

    //2. 静态内部类
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    //3. get方法
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
