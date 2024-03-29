package com.ray.design.patterns.state;

public interface PackageState {
    void next(Package pkg);
    void prev(Package pkg);
    void printStatus();
}
