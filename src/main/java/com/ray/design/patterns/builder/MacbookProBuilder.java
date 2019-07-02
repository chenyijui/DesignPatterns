package com.ray.design.patterns.builder;

public abstract class MacbookProBuilder {

    protected MacbookPro macbookPro;

    MacbookProBuilder() {
        macbookPro = new MacbookPro();
    }

    abstract MacbookProBuilder buildCPU(MacbookPro.Processor processor);

    public abstract MacbookProBuilder buildMemory(MacbookPro.Memory size);

    public abstract MacbookProBuilder buildGraphics(MacbookPro.Graphics name);

    public abstract MacbookProBuilder buildStorage(MacbookPro.Storage size);

    public abstract MacbookProBuilder buildKeyboard(MacbookPro.Keyboard language);

    public MacbookPro build() {
        return macbookPro;
    }

}