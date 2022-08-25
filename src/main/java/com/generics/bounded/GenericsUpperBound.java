package com.generics.bounded;

// we can specify that a method accepts a type an all its subclasses(upper bound)
public class GenericsUpperBound <T extends Number>{

    T[] numberArray;

    public GenericsUpperBound(T[] numberArray) {
        this.numberArray = numberArray;
    }

    public double getAverage(){
        double sum = 0;

        for (int i = 0; i < numberArray.length ; i++) {
            sum += numberArray[i].doubleValue();
        }
        double avg = sum/numberArray.length;
        return avg;
    }
    public static void main(String[] args) {

        Integer [] intArr = {2,5,45,34};

        GenericsUpperBound<Integer> gub1 = new GenericsUpperBound<>(intArr);

        System.out.println("Integer Array avg. value:" + gub1.getAverage());

        Double [] doubleArr = {2.45, 5.56, 45.56, 34.56};
        GenericsUpperBound<Double> gub2 = new GenericsUpperBound<>(doubleArr);

        System.out.println("Double Array avg. value:" + gub2.getAverage());


    }
}
