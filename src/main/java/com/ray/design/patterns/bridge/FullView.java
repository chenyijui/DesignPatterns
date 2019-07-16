package com.ray.design.patterns.bridge;

public class FullView extends View {
    @Override
    public void show() {
        resources.photo();
        resources.describe();
    }
}