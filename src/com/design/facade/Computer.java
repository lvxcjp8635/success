package com.design.facade;

import java.util.Collections;

public class Computer {
    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Computer() {
        this.cpu = new CPU();
        this.disk = new Disk();
        this.memory = new Memory();
    }

    public void start(){
        System.out.println("computer is startup");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("computer startup finished!");
    }

    public void shutdown(){
        System.out.println("computer is shutdown");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer is shutdown finished");
    }
}

