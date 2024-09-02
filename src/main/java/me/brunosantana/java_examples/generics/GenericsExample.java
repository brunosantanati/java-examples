package me.brunosantana.java_examples.generics;

import com.fasterxml.jackson.core.JsonProcessingException;

public class GenericsExample {

    public static void main(String[] args) throws JsonProcessingException {
        A<Integer> a = createA(Integer.class);
        a.setData(10);
        a.setObjAsString("{\"b\":\"anyValue\"}");
        a.print(B.class);
    }

    private static <T> A<T> createA(Class<T> clazz) { //created this param to help Java infer what T should be, but it works without this param
        A<T> a = new A<>();
        return a;
    }

}
