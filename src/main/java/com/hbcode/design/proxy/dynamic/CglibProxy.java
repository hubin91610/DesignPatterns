package com.hbcode.design.proxy.dynamic;


import org.mockito.cglib.proxy.Enhancer;
import org.mockito.cglib.proxy.MethodInterceptor;
import org.mockito.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLib采用了非常底层的字节码技术，其原理是通过字节码技术为一个类创建子类，并在子类中采用方法拦截的技术拦截所有父类方法的调用，顺势织入横切逻辑
 * 由于使用的是子类继承 所以对于 finl 类无能为力
 */
public class CglibProxy {
    public static <T> T  getCglibProxy(final Object t){
        Enhancer enhancer = new Enhancer();
        //继承被代理类
        enhancer.setSuperclass(t.getClass());
        //设置回调
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("cglib 动态代理");
                return method.invoke(t,objects);
            }
        });
        // 生成代理对象
        return (T) enhancer.create();

    }
}
