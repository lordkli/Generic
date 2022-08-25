package com.generics.bounded;


import java.util.ArrayList;
import java.util.List;

public class GenericsLowerBound {
    public static void main(String[] args) {

        List<Object> ol = new ArrayList<>();
        addNumber(ol);
        ol.forEach(o-> System.out.println(o));


        List<Number> ln = new ArrayList<>();
        addNumber(ln);
        ln.forEach(o-> System.out.println(o));


        List<Integer> li = new ArrayList<>();
        addNumber(li);
        li.forEach(o-> System.out.println(o));


//        addNumber3(li);  you can't because it accepts the just List<Object>


    }

    public static void addNumber(List<? super Integer> list){

        for (int i = 1; i <= 10 ; i++) {
            list.add(i);

        }
    }

    public static void addNumber2(List<?> mylist){
//        mylist.add("Java"); // it gives compile time error cunku hangi turden deger girecegini bekliyor
//        mylist.add(1);      // it gives compile time error cunku hangi turden deger girecegini bekliyor
        mylist.add(null);
    }


    public static void addNumber3(List<Object> myList){
        myList.add(10);
        myList.add("test");
    }
}


