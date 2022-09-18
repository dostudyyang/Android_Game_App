package com.example.lab8;

import java.util.List;
import java.util.Map;



import ca.roumani.i2c.Country;
import ca.roumani.i2c.CountryDB;

public class Game {
    private CountryDB db;

    public Game(){
        this.db = new CountryDB();
    }

    public String qa(){
       List<String> capitalsList = db.getCapitals();
       int index = (int)(241 * Math.random());
       String c = capitalsList.get(index);
       Map<String, Country> dataMap =db.getData();
       Country ref = dataMap.get(c);
       if(Math.random()<0.5){
           return  "What is the capital of "+ref.getName()+"?"+"\n"+ref.getCapital();
       }else {
           return ""+ref.getCapital()+" is the capital of?"+"\n"+ref.getName();
       }
    }
}
