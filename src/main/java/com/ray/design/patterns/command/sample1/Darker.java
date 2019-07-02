package com.ray.design.patterns.command.sample1;

public class Darker extends Command1 {
    public Darker(Light light) {
        super(light);
    }

    @Override
    public void execute() {
        light.darker();
    }

}