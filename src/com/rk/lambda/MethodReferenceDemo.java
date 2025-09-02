package com.rk.lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

class Employee{
    private final String firstName;
    private final String lastName;
    private final int age;

    public Employee(String firstName, String lastName, int age){
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

public class MethodReferenceDemo {
    public static void main(String[] args) {
        //Type 1 method reference
        Employee employee = new Employee("Will","Smith",30);
        Supplier<Integer> supplier = employee::getAge;
        System.out.println(supplier.get());

        //Type 2 Method Reference
        Consumer<String> consumer = Employee::displayFirstName;
        consumer.accept("Tom");

        //Type 3 Method reference
        TriFunction<Employee, String, String, String> triFunction = Employee::getFullName;
        System.out.println(triFunction.apply(new Employee("","",0),"Tom", "Cruise"));

        //Type 4 Method Reference: Constructor
        TriFunction<String, String, Integer, Employee> myFunction = Employee::new;
        System.out.println(myFunction.apply("Tom", "Cruise", 25));
    }
}
