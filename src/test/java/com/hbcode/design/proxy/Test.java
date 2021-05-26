package com.hbcode.design.proxy;

import com.hbcode.design.proxy.dynamic.CglibProxy;
import com.hbcode.design.proxy.dynamic.JDKProxy;

import java.io.IOException;


public class Test {

    @org.junit.Test
    public void testStatic() throws IOException {
        //真实对象，真正想买票的人
        People people = new People("王五");
        //代理对象（售票员），买票的人告诉售票员想买一张票
        TicketSeller ticketSeller = new TicketSeller(people);
        //买票
        ticketSeller.buyTrainTicket();

    }
    @org.junit.Test
    public void testJDKProxy() throws IOException {
        //真实对象，真正想买票的人
        People people = new People("王五");
        //代理对象（售票员），买票的人告诉售票员想买一张票
        TrainTicket ticketSeller = JDKProxy.<TrainTicket>getJdkProxy(people);
        //买票
        ticketSeller.buyTrainTicket();

    }
    @org.junit.Test
    public void testCglibProxy() throws IOException {
        //真实对象，真正想买票的人
        People2 people = new People2("王五");
        //代理对象（售票员），买票的人告诉售票员想买一张票
        People2  proxy = CglibProxy.<People2>getCglibProxy(people);
        //买票
        proxy.buyTrainTicket();

    }
}
