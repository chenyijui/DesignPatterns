package com.ray.design.patterns.command.sample1;

public abstract class Command1 {

    Light light;

    public Command1(Light light){
        this.light = light;
    }
    //https://ithelp.ithome.com.tw/articles/10204425
    public abstract void execute();
}