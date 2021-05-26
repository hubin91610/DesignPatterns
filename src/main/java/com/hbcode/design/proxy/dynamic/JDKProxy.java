package com.hbcode.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * java �ж�̬����
 * JDK ��̬����ԭ�� ��
 * ��������ʵ�ʶ��� ʵ�� ͬһ���ӿڣ������ɫ������Ҫʵ�ֽӿ�
 */
public class JDKProxy {

    /**
     * ��ȡ�������
     * J
     * @param t
     * @param <T>
     * @return
     */
    public static <T> T  getJdkProxy(final Object t){
         Object proxyInstance = Proxy.newProxyInstance(t.getClass().getClassLoader(),t.getClass().getInterfaces(), new InvocationHandler() {
             public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                 System.out.println("JDK ��̬����");
                 return  method.invoke(t,args);
             }
         });
        return (T)proxyInstance;
    }
}
