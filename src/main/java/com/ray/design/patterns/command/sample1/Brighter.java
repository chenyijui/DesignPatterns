package com.ray.design.patterns.command.sample1;

public class Brighter extends Command1 {
    public Brighter(Light light) {
        super(light);
    }

    @Override
    public void execute() {
        light.brighter();
    }
}