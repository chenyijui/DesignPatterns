package com.ray.design.patterns.builder;

public class MacbookPro {
    private Processor processor;
    private Memory memory;
    private Storage storage;
    private Graphics graphics;
    private Keyboard keyboard;

    MacbookPro(){}

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    @Override
    public String toString() {
        return "{ Macbook : " + "\n" +
                "Processor : " + this.getProcessor().name + "\n" +
                "Memory size : " + this.getMemory().size + "GB" + "\n" +
                "Graphics : " + this.getGraphics().name + "\n" +
                "Storage size : " + this.getStorage().size + "GB" +"\n" +
                "Keyboard language : "+ this.getKeyboard().language +
                " }";
    }

    public static class Processor{
        String name;
        public Processor(String name){
            this.name = name;
        }
    }

    public static class Memory{
        int size;
        public Memory(int size){
            this.size = size;
        }
    }

    public static class Graphics{
        String name;
        public Graphics(String name){
            this.name = name;
        }
    }

    public static class Storage{

        int size;

        public Storage(int size){
            this.size = size;
        }

    }
    public static class Keyboard{

        String language;

        public Keyboard(String language){
            this.language = language;
        }

    }
}
