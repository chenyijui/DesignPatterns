package com.ray.design.patterns.command.sample1;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command1> commandList = new ArrayList<>();

    public void addCommand(Command1 command) {
        commandList.add(command);
    }

    public void execute() {
        for (Command1 command :
                commandList) {
            command.execute();
        }
    }
}
