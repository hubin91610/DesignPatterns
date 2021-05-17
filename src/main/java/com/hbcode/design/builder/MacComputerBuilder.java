package com.hbcode.design.builder;


public class MacComputerBuilder extends ComputerBuilder{


    public MacComputerBuilder() {
        super();
    }

    @Override
    public ComputerBuilder setCpu() {
        // 在这个过程中可以做很多其它的事，比如初始化CPU等等，这应该是个复杂的过程
        // 其它属性也是一样
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
