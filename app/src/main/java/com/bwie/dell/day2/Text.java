package com.bwie.dell.day2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.TreeMap;

public class Text {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Person person = new Person();

        //类模板对象的三种获取方式
        //通过.class
        Class<Person> personClass = Person.class;
        //通过全类名
        Class<Person> aClass = (Class<Person>) Class.forName("com.bwie.dell.day2.Person");
        //通过对象
        Class<Person> aClass1 = (Class<Person>) person.getClass();

        //获取public声明的成员变量
        //Field[] fields = aClass1.getFields();
        //所有声明的成员变量
//        Field[] fields1 = aClass.getDeclaredFields();
//        //根据属性名字获取该属性对象
//        Field age = aClass1.getDeclaredField("age");
//        age.setAccessible(true);
//        //通过反射给属性赋值
//        age.set(person, "18");
//
//        //根据属性的名字获取该属性对象
//        Field name = aClass1.getDeclaredField("name");
//        name.setAccessible(true);
//        //通过反射赋值
//        name.set(person, "yankuokuo");
//
//        Field gender = aClass1.getDeclaredField("gender");
//        gender.setAccessible(true);
//        gender.set(person, "女");
//
//        //指定方法名字 和方法参数类型去获取method的对象
//        Method setAge = aClass1.getDeclaredMethod("setAge", String.class);
//        setAge.setAccessible(true);
//        setAge.invoke(person, "28");
//        System.out.println("========" + person);
//
//        //通过类模板对象获取构造器,然后通过构造器创建对象
//        Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor(String.class, String.class, String.class);
//        declaredConstructor.setAccessible(true);
//        Person person1 = declaredConstructor.newInstance("yankuokuo", "女", "20");
//        System.out.println("========" + person1);
        Method[] declaredMethods = aClass1.getDeclaredMethods();
        for (Method method:declaredMethods){
            method.setAccessible(true);
            if (method.getName().equals("setGender")){
                method.invoke(person,"女");
            }
        }
        Field[] declaredFields = aClass1.getDeclaredFields();
        for (Field field: declaredFields) {
            field.setAccessible(true);
            if (field.getName().equals("name")){
                field.set(person,"wangtao");
            }
            if (field.getName().equals("age")){
                field.set(person,"30");
            }

        }
        System.out.println("===="+person);
    }
}
