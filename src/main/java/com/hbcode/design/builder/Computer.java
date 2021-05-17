package com.hbcode.design.builder;

public class Computer {

    protected String cpu;

    protected String board;

    protected String memory;

    protected String os;


    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", board='" + board + '\'' +
                ", memory='" + memory + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
