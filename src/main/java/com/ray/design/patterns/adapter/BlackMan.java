package com.ray.design.patterns.adapter;

public class BlackMan {

    String name;

    public BlackMan(String name){
        this.name = name;
    }

    public void helloEnglish(){
        System.out.println("yo~ what's up!! niga~");
    }

    public void selfIntroEnglish(){
        System.out.println("hello, I living in taipei. " +
                "my name is " + this.name + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
