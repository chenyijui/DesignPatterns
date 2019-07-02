package com.ray.design.patterns.command.sample2;

public abstract class ICommandTetris {
    //抽象的命令
    protected Tetris tetris;

    public ICommandTetris(Tetris tetris) {
        this.tetris = tetris;
    }

    public abstract void execute();

}