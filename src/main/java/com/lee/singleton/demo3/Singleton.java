package com.lee.singleton.demo3;

/**
 * 饿汉式：
 *      线程安全
 */
public class Singleton {


    //1. 私有构造器
    private Singleton() {}

    //2. 私有静态成员变量
    private static Singleton singleton;

    //3. 共有方法获取
    public static  Singleton getInstance() {

        // 如果初始化过，直接返回
        if(singleton == null) {
            //多线程会创建多个，sync改进
            synchronized (Singleton.class) {
                //拿到锁后再次判断是否为null
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
