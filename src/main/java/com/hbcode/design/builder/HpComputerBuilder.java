package com.hbcode.design.builder;


public class HpComputerBuilder extends ComputerBuilder{


    public HpComputerBuilder() {
        super();
    }

    @Override
    public ComputerBuilder setCpu() {
        // ����������п������ܶ��������£������ʼ��CPU�ȵȣ���Ӧ���Ǹ����ӵĹ���
        // ��������Ҳ��һ��
        computer.setCpu("HP_CPU");
        return this;
    }
    @Override
    public ComputerBuilder setboard() {
        computer.setBoard("HP_Board");
        return this;
    }
    @Override
    public ComputerBuilder setMemory() {
        computer.setMemory("HP_Memory");
        return this;
    }
    @Override
    public ComputerBuilder setOs() {
        computer.setOs("HP_Os");
        return this;
    }
    @Override
    public Computer build() {
        return computer;
    }
}
