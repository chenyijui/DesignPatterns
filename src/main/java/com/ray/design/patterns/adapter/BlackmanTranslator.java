package com.ray.design.patterns.adapter;

public class BlackmanTranslator extends People{

    public BlackmanTranslator(String name) {
        super(name);
    }

    @Override
    public void hello() {
        System.out.println(getName() + ":哩甲霸咩～真的假的！？");
    }

    @Override
    public void selfIntro() {
        System.out.println("大家好我是" + getName() +
                "，現在台北工作。");
    }
}
