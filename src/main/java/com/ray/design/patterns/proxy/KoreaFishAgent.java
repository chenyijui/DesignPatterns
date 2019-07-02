package com.ray.design.patterns.proxy;

public class KoreaFishAgent implements IBuyDream {
    private IBuyDream iBuyDream;

    public KoreaFishAgent(IBuyDream iBuyDream) {
        this.iBuyDream = iBuyDream;
    }

    @Override
    public void sell() {
        iBuyDream.sell();
        System.out.println("KoreaFish 幫你直銷洗腦");
    }

    @Override
    public void makeMomey() {
        iBuyDream.makeMomey();
        System.out.println("台灣安全、人民有錢 大家發大財");
    }
}
