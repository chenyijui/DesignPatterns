package com.ray.design.patterns.factory.abstractFactory;

public class SUVFactory extends AbstractFactory {
    @Override
    public Audi createAudi() {
        return new AudiSUV();
    }

    @Override
    public BMW createBMW() {
        return new BMWSUV();
    }
}
