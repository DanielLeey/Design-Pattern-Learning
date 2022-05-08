package com.lee.singleton.demo5;

/**
 * 懒汉式：
 *      静态内部类
 *      利用反射会破坏单例，需要改进
 */
public class Singleton {

    //表示未被初始化，需要是static
    private static boolean flag = false;

    //1. 私有构造器
    private Singleton() {
        if (flag) {
            throw new RuntimeException("已经初始化过，抛出异常");
        }
        flag = true;
    }

    //2. 静态内部类
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    //3. get方法
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
