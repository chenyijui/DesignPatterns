package com.ray.design.patterns.command.sample1;

public class TurnOff extends Command1 {
    public TurnOff(Light light) {
        super(light);
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
