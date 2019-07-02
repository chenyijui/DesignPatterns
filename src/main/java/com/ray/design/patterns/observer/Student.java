package com.ray.design.patterns.observer;

public class Student implements IObserver {
    IObserverable observerable;

    public Student(IObserverable observerable){
        this.observerable = observerable;
    }

    @Override
    public void update() {
        System.out.println("聽了" + observerable.getName());
    }

}
