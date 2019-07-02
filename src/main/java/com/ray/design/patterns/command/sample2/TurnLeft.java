package com.ray.design.patterns.command.sample2;

public class TurnLeft extends ICommandTetris {

    public TurnLeft(Tetris tetris) {
        super(tetris);
    }

    @Override
    public void execute() {
        tetris.trunLeft();
    }
}
