package com.ray.design.patterns.mediator;

public abstract class CoWorker {

    String name;

    Boss boss;

    public CoWorker(String name){
        this.name = name;
    }

    public abstract void work();

}
