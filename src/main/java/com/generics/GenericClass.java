package com.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericClass <T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericClass<String> obj = new GenericClass<>();
        obj.setT("Java");

        System.out.println(obj.getT());

        GenericClass<Integer> obj1 = new GenericClass<>();
//        obj1.setT("John"); // it gives compile time error cunku int tanimladik string girdik
        obj1.setT(45);

//  if you don't specify any type it uses object
//        GenericClass g = new GenericClass<>();

       List<String> list = new ArrayList<>();
       list.add("ASDASD");
//       list.add(12); // it gives the compile time error

        Map<String,Boolean> map = new HashMap<>();

        map.put("1", true);
        map.put("2", false);

    }
}
