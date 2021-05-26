package com.hbcode.design.proxy;

/**
 * 真实角色（想买票的人）
 */
public class People2{
    private String name;
    public People2(){};
    public People2(String name){
        this.name = name;
    }

    /**
     * 需要在真实角色中实现真正的逻辑
     * 如：买了一张票
     */
    public void buyTrainTicket() {
        System.out.println(this.name +": 买了一张票。");

    }
}