package com.ray.design.patterns.command.sample1;

import com.ray.design.patterns.command.sample2.ICommandTetris;
import com.ray.design.patterns.command.sample2.Tetris;

public class StraightDown extends ICommandTetris {
    public StraightDown(Tetris tetris) {
        super(tetris);
    }

    @Override
    public void execute() {
        tetris.straightDown();
    }
}