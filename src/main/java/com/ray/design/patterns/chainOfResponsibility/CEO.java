package com.ray.design.patterns.chainOfResponsibility;

public class CEO extends Handler {
    @Override
    public void handleRequest(Trouble trouble) {
        System.out.println("CEO:" + trouble.getName() + "是誰搞的！叫他過來。");
    }
}
