package com.generics;


// you can use more types
//public class GenericClassTwoParams<K,V,M,N,O>
public class GenericClassTwoParams <K,V>{

    private K key;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    private V value;

    public GenericClassTwoParams(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static void main(String[] args) {

        GenericClassTwoParams<Integer, String> myMap = new GenericClassTwoParams<>(1, "John");

        System.out.println(myMap.getKey().toString() + ":" + myMap.getValue());
    }
}
