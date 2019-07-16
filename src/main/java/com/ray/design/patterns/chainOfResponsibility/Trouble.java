package com.ray.design.patterns.chainOfResponsibility;

public class Trouble {
    private String name;

    private int size;

    public Trouble(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
