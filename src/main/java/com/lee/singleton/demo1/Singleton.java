package com.lee.singleton.demo1;

/**
 * 懒汉式：
 *      私有静态成员方式
 */
public class Singleton {

    //1. 私有构造器
    private Singleton() {}

    //2. 私有静态成员变量
    private static Singleton singleton = new Singleton();

    //3. 返回方法
    public static Singleton getInstance() {
        return singleton;
    }
}
