package com.hbcode.design.proxy;

/**
 * ��ʵ��ɫ������Ʊ���ˣ�
 */
public class People implements TrainTicket{
    private String name;
    public People(String name){
        this.name = name;
    }

    /**
     * ��Ҫ����ʵ��ɫ��ʵ���������߼�
     * �磺����һ��Ʊ
     */
    public void buyTrainTicket() {
        System.out.println(this.name +": ����һ��Ʊ��");

    }
}