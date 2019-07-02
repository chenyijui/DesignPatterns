package com.ray.design.patterns.command.sample2;

public class Invoker2 {

    ICommandTetris command;

    public Invoker2(ICommandTetris command) {
        this.command = command;
    }

    public void setCommand(ICommandTetris command) {
        this.command = command;
    }

    public void invoke() {
        command.execute();
    }
}
