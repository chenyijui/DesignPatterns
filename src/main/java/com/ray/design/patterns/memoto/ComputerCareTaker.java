package com.ray.design.patterns.memoto;

import java.util.ArrayList;
import java.util.List;

public class ComputerCareTaker {

    //    最多備份15筆
    private static final int MAX = 15;

    public List<ComputerMemoto> saves = new ArrayList<>();

    //    獲取電腦資訊
    public ComputerMemoto getSave(int index){
        if(index > saves.size() - 1){
            index = saves.size() - 1 ;
        }

        return saves.get(index);
    }

    public void saveMemoto(ComputerMemoto memoto){
        if (saves.size() > MAX){
            saves.remove(0);
        }
        saves.add(memoto);
    }

}
