package com.softwareCompany;

import java.util.ArrayList;
import java.util.List;
public class CustomCollection<T> {

    private List <T> items;


//empty constructor
    public CustomCollection(){
        this.items= new ArrayList<>();
    }

    // constructor with parameters
    public CustomCollection(List<T> items) {
        this.items = items;
    }


    public void add(T item){
        items.add(item);

    }



}
