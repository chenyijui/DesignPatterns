package com.ray.design.patterns.proxy;

public class LittleEngineer implements IBuyDream {
    @Override
    public void sell() {
        System.out.println("請幫我行銷");
    }

    @Override
    public void makeMomey() {
        System.out.println("人民有安全嗎?");
    }
}
