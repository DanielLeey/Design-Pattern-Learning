package com.lee.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 提供生成代理类的方法
 */
public class JDKProxyFactory {

    private TrainStation trainStation = new TrainStation();

    public SellTicks getProxy() {
        /**
         * ClassLoader loader,
         * Class<?>[] interfaces,
         * InvocationHandler h
         */
        //生成代理对象，需要强制转换
        SellTicks proxyInstance = (SellTicks) Proxy.newProxyInstance(trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    /*
                        InvocationHandler中invoke方法参数说明：
                            proxy ： 代理对象
                            method ： 对应于在代理对象上调用的接口方法的 Method 实例
                            args ： 代理对象调用接口方法时传递的实际参数
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("代理点收取一些服务费用(JDK动态代理方式)");
                        //执行真实对象
                        Object result = method.invoke(trainStation, args);
                        return result;

                    }
                });
        return proxyInstance;
    }
}
