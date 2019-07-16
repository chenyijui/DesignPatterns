package com.ray.design.patterns.flyweight;

public class CustomSetting {

    //儲存一些使用者設定的類別

    public static CustomSetting LOW = new CustomSetting("LOW");
    public static CustomSetting HIGH = new CustomSetting("HIGH");


    private String cpu;
    private int memory;
    private int storage;

    public CustomSetting() {
    }

    private CustomSetting(String set) {

        switch (set) {
            case "LOW":
//                一些低階設定
                cpu = "i5";
                memory = 8;
                storage = 256;
                break;
            case "HIGH":
//                一些高階設定
                cpu = "i7";
                memory = 16;
                storage = 512;
                break;
            default:
                break;

        }

    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }


    @Override
    public String toString() {
        return "CustomSetting = { " + "\n" +
                "cpu = " + this.getCpu() + "\n" +
                "memory = " + this.getMemory() + "\n" +
                "storage = " + this.getStorage() + "\n" +
                "}";
    }
}
