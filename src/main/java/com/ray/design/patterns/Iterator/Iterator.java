package com.ray.design.patterns.Iterator;

public interface Iterator {
    public Object First();
    public Object Next();
    public boolean IsDone();
    public Object CurrentItem();
}
