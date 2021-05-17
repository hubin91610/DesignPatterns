package com.hbcode.design.builder;


public class MacComputerBuilder extends ComputerBuilder{


    public MacComputerBuilder() {
        super();
    }

    @Override
    public ComputerBuilder setCpu() {
        // ����������п������ܶ��������£������ʼ��CPU�ȵȣ���Ӧ���Ǹ����ӵĹ���
        // ��������Ҳ��һ��
        computer.setCpu("Mac_CPU");
        return this;
    }
    @Override
    public ComputerBuilder setboard() {
        computer.setBoard("Mac_Board");
        return this;
    }
    @Override
    public ComputerBuilder setMemory() {
        computer.setMemory("Mac_Memory");
        return this;
    }
    @Override
    public ComputerBuilder setOs() {
        computer.setOs("Mac_Os");
        return this;
    }
    @Override
    public Computer build() {
        return computer;
    }
}
