package com.ray.design.patterns.factory.abstractFactory;

public abstract class Audi {

    private String brand;
    private String type;

    public Audi(){
        this.brand = "Audi";
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }
}
