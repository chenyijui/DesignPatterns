package com.ray.design.patterns.adapter;

public class TaiwanMan {
    private People people;

    public TaiwanMan(People people){
        this.people = people;
    }

    public void hello(){
        people.hello();
    }

    public void selfIntro(){
        people.selfIntro();
    }
}
