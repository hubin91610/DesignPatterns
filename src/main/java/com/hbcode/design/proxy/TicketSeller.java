package com.hbcode.design.proxy;

/**
 * �����ɫ(��ƱԱ)
 */
public class TicketSeller implements TrainTicket{

    //�����ɫ����Ҫ������ʵ��ɫ
    private People people;

    public TicketSeller (People people){
        this.people = people;
    }
    /**
     * �κζ���ʵ��ɫ�Ĳ�����Ҫͨ�������ɫ����
     * �����ڲ�����ʵ����ʱ�������һЩ����Ĳ���
     * �磺����ĺ˶���Ʊ����Ϣ��ȡƱ
     */
    public void buyTrainTicket() {
        //�˶���Ʊ����Ϣ
        this.checkInfo();
        //��Ʊ
        people.buyTrainTicket();
        //��ӡ��Ʊ
        this.printTicket();
    }

    /**
     * �˶���Ʊ����Ϣ
     */
    private void checkInfo (){
        System.out.println("��ƱԱ�˶���Ʊ����Ϣ��");
    }

    /**
     * ��ӡ��Ʊ����Ʊ��
     */
    private void printTicket (){
        System.out.println("��ƱԱ��ӡ��Ʊ����Ʊ�ˡ�");
    }
}