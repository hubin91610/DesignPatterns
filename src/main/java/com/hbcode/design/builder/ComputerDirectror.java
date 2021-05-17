package com.hbcode.design.builder;

public class ComputerDirectror {
    private ComputerBuilder builder;

    public ComputerDirectror(ComputerBuilder builder) {
        this.builder = builder;
    }

    // ��װ����
    public Computer construct() {
        builder.setCpu();
        builder.setboard();
        builder.setMemory();
        builder.setOs();
        return builder.build();
    }
}
