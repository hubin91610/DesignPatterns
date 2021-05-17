package com.hbcode.design.builder;

import java.io.IOException;


public class Test {

    @org.junit.Test
    public void testBuilder() throws IOException {
        // ������
        ComputerBuilder builder = new HpComputerBuilder();
        // ָ����
        ComputerDirectror directror = new ComputerDirectror(builder);
        // ָ����ָ�ӽ����߹���������
        Computer computer = directror.construct();
        System.out.println(computer.toString());

        MacComputerBuilder builder1 = new MacComputerBuilder();
        ComputerDirectror directror1 = new ComputerDirectror(builder1);
        Computer computer1 = directror1.construct();
        System.out.println(computer1.toString());

    }
}
