package com.ray.design.patterns.command.sample1;

public class TurnOn extends Command1 {
    public TurnOn(Light light) {
        super(light);
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
