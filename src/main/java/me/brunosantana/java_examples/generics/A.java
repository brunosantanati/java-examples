package me.brunosantana.java_examples.generics;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class A<T> {

    T data;
    String objAsString;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getObjAsString() {
        return objAsString;
    }

    public void setObjAsString(String objAsString) {
        this.objAsString = objAsString;
    }

    public <R> void print(Class<R> clazz) throws JsonProcessingException { //we can call this method like a.print(B.class);
        System.out.println(data);
        System.out.println(new ObjectMapper().readValue(objAsString, clazz));
    }

}
