package com.ray.design.patterns.mediator;

public interface Company {

    public void addMember(CoWorker coWorker);

    public void introduce(CoWorker coWorker);

    public void workHard();

    public void giveWork(CoWorker coWorker);

}
