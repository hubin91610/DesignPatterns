package com.hbcode.design.proxy.dynamic;


import org.mockito.cglib.proxy.Enhancer;
import org.mockito.cglib.proxy.MethodInterceptor;
import org.mockito.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLib�����˷ǳ��ײ���ֽ��뼼������ԭ����ͨ���ֽ��뼼��Ϊһ���ഴ�����࣬���������в��÷������صļ����������и��෽���ĵ��ã�˳��֯������߼�
 * ����ʹ�õ�������̳� ���Զ��� finl ������Ϊ��
 */
public class CglibProxy {
    public static <T> T  getCglibProxy(final Object t){
        Enhancer enhancer = new Enhancer();
        //�̳б�������
        enhancer.setSuperclass(t.getClass());
        //���ûص�
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("cglib ��̬����");
                return method.invoke(t,objects);
            }
        });
        // ���ɴ������
        return (T) enhancer.create();

    }
}
