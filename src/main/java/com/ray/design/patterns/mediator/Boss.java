package com.ray.design.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class Boss implements  Company {
    List<CoWorker> coWorkers;

    public Boss(){
        coWorkers = new ArrayList<>();
    }

    @Override
    public void addMember(CoWorker coWorker){
        coWorkers.add(coWorker);
        coWorker.boss = this;
    }

    @Override
    public void introduce(CoWorker coWorker) {
        System.out.println("Boss:跟大家介紹這位是" + coWorker.name);
    }

    @Override
    public void workHard() {
        for (CoWorker c: coWorkers
        ) {
            System.out.println("Boss:" + c.name + "認真點做啊！");
        }
    }

    @Override
    public void giveWork(CoWorker coWorker) {
        System.out.println("Boss:" + coWorker.name + "這個幫忙一下。");
    }
}
