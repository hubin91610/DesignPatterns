package com.hbcode.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * java 中动态代理
 * JDK 动态代理原理 是
 * 代理对象和实际对象 实现 同一个接口（抽象角色）必须要实现接口
 */
public class JDKProxy {

    /**
     * 获取代理对象
     * J
     * @param t
     * @param <T>
     * @return
     */
    public static <T> T  getJdkProxy(final Object t){
         Object proxyInstance = Proxy.newProxyInstance(t.getClass().getClassLoader(),t.getClass().getInterfaces(), new InvocationHandler() {
             public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                 System.out.println("JDK 动态代理");
                 return  method.invoke(t,args);
             }
         });
        return (T)proxyInstance;
    }
}
