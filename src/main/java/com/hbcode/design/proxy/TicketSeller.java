package com.hbcode.design.proxy;

/**
 * 代理角色(售票员)
 */
public class TicketSeller implements TrainTicket{

    //代理角色中需要持有真实角色
    private People people;

    public TicketSeller (People people){
        this.people = people;
    }
    /**
     * 任何对真实角色的操作都要通过代理角色进行
     * 并且在操作真实对象时可以添加一些额外的操作
     * 如：这里的核对买票人信息，取票
     */
    public void buyTrainTicket() {
        //核对买票人信息
        this.checkInfo();
        //买票
        people.buyTrainTicket();
        //打印车票
        this.printTicket();
    }

    /**
     * 核对买票人信息
     */
    private void checkInfo (){
        System.out.println("售票员核对买票人信息。");
    }

    /**
     * 打印车票给买票人
     */
    private void printTicket (){
        System.out.println("售票员打印车票给买票人。");
    }
}