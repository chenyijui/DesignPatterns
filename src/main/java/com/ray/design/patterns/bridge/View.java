package com.ray.design.patterns.bridge;

public abstract class View {

    Resources resources;

    public void setResources(Resources resources){
        this.resources = resources;
    }

    //    定義畫面如何擺放
    public abstract void show();

}