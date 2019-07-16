package com.ray.design.patterns.chainOfResponsibility;

public abstract class Handler {

    Handler successor;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public abstract void handleRequest(Trouble trouble);
}