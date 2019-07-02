package com.ray.design.patterns.command.sample2;

public class Tetris {
    public Tetris(){
    }

    public void trunLeft(){
        System.out.println("向左轉");
    }

    public void turnRight(){
        System.out.println("向右轉");
    }

    public void straightDown(){
        System.out.println("直接下降");
    }
}
