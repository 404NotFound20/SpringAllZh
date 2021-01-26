package com.zh.modletest.Reflection;

/**
 * 反射
 */
public class ReflectionTest {

    public static void main(String[] args) throws ClassNotFoundException {
        Class cls1 = Class.forName("com.zh.modletest.Reflection.Person");
        System.out.println(cls1);

        Class<Person> cls2 = Person.class;
        System.out.println(cls2);

        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        System.out.println(cls1 == cls2);
        System.out.println(cls2 == cls3);
        System.out.println(cls1 == cls3);
    }

}
