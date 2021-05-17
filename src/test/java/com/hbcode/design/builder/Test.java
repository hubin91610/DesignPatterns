package com.hbcode.design.builder;

import java.io.IOException;


public class Test {

    @org.junit.Test
    public void testBuilder() throws IOException {
        // 建造者
        ComputerBuilder builder = new HpComputerBuilder();
        // 指挥者
        ComputerDirectror directror = new ComputerDirectror(builder);
        // 指挥者指挥建造者构造具体对象
        Computer computer = directror.construct();
        System.out.println(computer.toString());

        MacComputerBuilder builder1 = new MacComputerBuilder();
        ComputerDirectror directror1 = new ComputerDirectror(builder1);
        Computer computer1 = directror1.construct();
        System.out.println(computer1.toString());

    }
}
