package com.lee.singleton.demo2;

/**
 * 懒汉式：
 *    静态代码块方式
 *    类的加载而创建，也存在内存浪费问题
 */
public class Singleton {
    //1. 私有构造器
    private Singleton() {}

    //2. 私有静态成员变量
    private static Singleton singleton;

    //3.静态代码块
    static {
        singleton = new Singleton();
    }

    //4.返回方法
    public static Singleton getInstance() {
        return singleton;
    }
}
