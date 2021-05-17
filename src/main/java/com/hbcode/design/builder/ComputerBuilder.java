package com.hbcode.design.builder;


public abstract class ComputerBuilder {

    protected Computer computer;

    protected ComputerBuilder() {
        this.computer = new Computer();
    }

    public abstract ComputerBuilder setCpu();
    public abstract ComputerBuilder setboard();
    public abstract ComputerBuilder setMemory();
    public abstract ComputerBuilder setOs();

    public abstract Computer build();

}
