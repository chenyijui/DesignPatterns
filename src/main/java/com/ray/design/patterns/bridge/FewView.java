package com.ray.design.patterns.bridge;

public class FewView extends View{
    @Override
    public void show() {
        resources.photo();
        resources.snippet();
    }
}