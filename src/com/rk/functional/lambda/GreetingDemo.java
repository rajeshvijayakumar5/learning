package com.rk.functional.lambda;

class Greeter {
    void shortGreeting(String personName){
        System.out.println("Hello "+personName);
    }
    void detailedGreeting(String personName){
        System.out.println("Welcome, " + personName + "! Have a great day.");
    }
}

@FunctionalInterface
interface GreetingFunction {
    void accept(String str);
}

public class GreetingDemo {
    // A higher-order function is one that can take functions as parameters
    // or return functions as results. Here we pass methods (via lambdas
    // and method references) as arguments to another function
    static void executeGreeting(GreetingFunction func, String personName){
        func.accept(personName);
    }
    static GreetingFunction getGreetingFunction(){
        Greeter obj = new Greeter();
        return obj::shortGreeting;
    }
    public static void main(String [] args){
        Greeter obj = new Greeter();
        // Lambda expression
        GreetingFunction lambdaGreeting = personName -> obj.shortGreeting(personName);
        // Method reference
        GreetingFunction methodRefGreeting = obj::detailedGreeting;

        // Demonstration of higher-order functions in Java: passing a function as an argument
        executeGreeting(lambdaGreeting, "John");
        executeGreeting(methodRefGreeting, "Adam");

        // Demonstration of higher-order functions in Java: returning a function
        GreetingFunction lambdaGreeting2 = getGreetingFunction();
        lambdaGreeting2.accept("Tom");
    }
}
