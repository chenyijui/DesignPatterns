package com.ray.design.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Component {
    String name;

    List<Component> componentList = new ArrayList<>();

    public Component(String name){
        this.name = name;
    }

    public void add(Component component){
        componentList.add(component);
    }

    public void remove(Component component){
        componentList.remove(component);
    }

    public void display(int depth){

        for (int i = 0; i < depth ; i++) {
            System.out.print("-");
        }

        System.out.println(this.name +"EEEE");

        for (Component c: componentList ) {
            c.display(depth + 2);
        }
    }

    public void command(String command){

        System.out.println(this.name + " " + command);

        for (Component c: componentList
        ) {
            c.command(command);
        }

    }

}