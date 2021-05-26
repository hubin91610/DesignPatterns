package com.hbcode.design.proxy;

import com.hbcode.design.proxy.dynamic.CglibProxy;
import com.hbcode.design.proxy.dynamic.JDKProxy;

import java.io.IOException;


public class Test {

    @org.junit.Test
    public void testStatic() throws IOException {
        //��ʵ������������Ʊ����
        People people = new People("����");
        //���������ƱԱ������Ʊ���˸�����ƱԱ����һ��Ʊ
        TicketSeller ticketSeller = new TicketSeller(people);
        //��Ʊ
        ticketSeller.buyTrainTicket();

    }
    @org.junit.Test
    public void testJDKProxy() throws IOException {
        //��ʵ������������Ʊ����
        People people = new People("����");
        //���������ƱԱ������Ʊ���˸�����ƱԱ����һ��Ʊ
        TrainTicket ticketSeller = JDKProxy.<TrainTicket>getJdkProxy(people);
        //��Ʊ
        ticketSeller.buyTrainTicket();

    }
    @org.junit.Test
    public void testCglibProxy() throws IOException {
        //��ʵ������������Ʊ����
        People2 people = new People2("����");
        //���������ƱԱ������Ʊ���˸�����ƱԱ����һ��Ʊ
        People2  proxy = CglibProxy.<People2>getCglibProxy(people);
        //��Ʊ
        proxy.buyTrainTicket();

    }
}
