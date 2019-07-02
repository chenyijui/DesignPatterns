package com.ray.design.patterns.command.sample2;

public class TurnRight extends ICommandTetris{

    public TurnRight(Tetris tetris) {
        super(tetris);
    }

    @Override
    public void execute() {
        tetris.turnRight();
    }
}