package com.rk.functional.lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

class MyClass{
    private final String firstName;
    private final String lastName;
    private final int age;

    public MyClass(String firstName, String lastName,  int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public static void displayFirstName(String name){
        System.out.println(name);
    }

    public String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    @Override
    public String toString(){
        return firstName + " " + lastName+" "+age;
    }
}

@FunctionalInterface
interface TriFunction<T,U,R,S>{
    S apply(T t, U u, R r);
}

public class MethodReferenceExample {
    public static void main(String[] args) {
        //Type 1 method reference
        MyClass myClass = new MyClass("","",0);
        Supplier<Integer> supplier = myClass::getAge;
        System.out.println(supplier.get());

        //Type 2 Method Reference
        Consumer<String> consumer = MyClass::displayFirstName;
        consumer.accept("Tom");

        //Type 3 Method reference
        TriFunction<MyClass, String, String, String> triFunction = MyClass::getFullName;
        System.out.println(triFunction.apply(new MyClass("","",0),"Tom", "Cruise"));

        //Type 4 Method Reference: Constructor
        TriFunction<String, String, Integer, MyClass> myFunction = MyClass::new;
        System.out.println(myFunction.apply("Tom", "Cruise", 25));
    }
}
