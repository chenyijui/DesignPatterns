package com.ray.design.patterns.builder;

public class MacbookPro_2018 extends MacbookProBuilder {
    @Override
    public MacbookPro build() {
        return super.build();
    }

    public MacbookPro_2018() {
        super();
    }

    @Override
    public MacbookProBuilder buildCPU(MacbookPro.Processor processor) {
        this.macbookPro.setProcessor(processor);
        return this;
    }

    @Override
    public MacbookProBuilder buildMemory(MacbookPro.Memory size) {
        this.macbookPro.setMemory(size);
        return this;
    }

    @Override
    public MacbookProBuilder buildGraphics(MacbookPro.Graphics name) {
        this.macbookPro.setGraphics(name);
        return this;
    }

    @Override
    public MacbookProBuilder buildStorage(MacbookPro.Storage size) {
        this.macbookPro.setStorage(size);
        return this;
    }

    @Override
    public MacbookProBuilder buildKeyboard(MacbookPro.Keyboard language) {
        this.macbookPro.setKeyboard(language);
        return this;
    }
}
