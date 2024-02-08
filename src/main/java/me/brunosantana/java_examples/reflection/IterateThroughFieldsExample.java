package me.brunosantana.java_examples.reflection;

import java.lang.reflect.Field;

class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class IterateThroughFieldsExample {

    public static void main(String[] args) {
        Person person = new Person(37, "Bruno");
        printFieldsAndItsValues(person);
    }

    public static void printFieldsAndItsValues(Person person) {
        Class<?> clazz = person.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value = field.get(person);
                System.out.println("Field name: " + field.getName());
                System.out.println("Field value: " + value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
