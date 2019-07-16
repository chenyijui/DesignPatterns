package com.ray.design.patterns.mediator;

public class Programmer extends CoWorker {
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(this.name + "寫程式");
    }
}