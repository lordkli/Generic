package com.generics.interfacetype;

// if a class implements a generic interface, this class has to be a generic class
public class GenericClassImpl <T> implements GenericInterface <T> {

    @Override
    public void setValue(T t) {

    }

    @Override
    public T getValue() {
        return null;
    }
}
