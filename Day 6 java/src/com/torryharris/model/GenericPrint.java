package com.torryharris.model;

public class GenericPrint<T>{
    private T obj;

    @Override
    public String toString() {
        return "GenericPrint{" +
                "obj=" + obj +
                '}';
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public GenericPrint(T obj) {
        this.obj = obj;
    }
}
