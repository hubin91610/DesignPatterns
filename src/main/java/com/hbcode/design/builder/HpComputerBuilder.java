package com.hbcode.design.builder;


public class HpComputerBuilder extends ComputerBuilder{


    public HpComputerBuilder() {
        super();
    }

    @Override
    public ComputerBuilder setCpu() {
        // 在这个过程中可以做很多其它的事，比如初始化CPU等等，这应该是个复杂的过程
        // 其它属性也是一样
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
