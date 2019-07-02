package com.ray.design.patterns.command.sample1;

public class Light {
    //Receiver可以是任何的類
    public void turnOn(){
        System.out.println("打開燈");
    }

    public void turnOff(){
        System.out.println("關燈");
    }

    public void brighter(){
        System.out.println("亮度提高");
    }

    public void darker(){
        System.out.println("亮度降低");
    }

}