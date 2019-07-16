package com.ray.design.patterns.flyweight;

import java.util.HashMap;

public class MacbookFactory {
    private HashMap<CustomSetting,Macbook> cache = new HashMap();


    public Macbook getCustomMacbook(CustomSetting key){

        if(cache.containsKey(key)){
            return cache.get(key);
        }

        Macbook macbook = new Macbook(key);

        cache.put(key,macbook);

        return macbook;

    }

    public Macbook getMacbook(Macbook.Spec spec){

        if(cache.containsKey(spec.getCustomSetting())){
            return cache.get(spec.getCustomSetting());
        }

        Macbook macbook = new Macbook(spec);

        cache.put(spec.getCustomSetting(),macbook);

        return macbook;
    }

}
