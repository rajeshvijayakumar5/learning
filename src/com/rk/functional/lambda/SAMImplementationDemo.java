package com.rk.functional.lambda;

/**
 * Demonstrates different ways of implementing a Single Abstract Method (SAM) interface
 */
@FunctionalInterface
interface MySAMInterface {
    void greet();
}

/**
 * Implementation using a separate class (direct interface implementation)
 */
class MySAM implements MySAMInterface {
    @Override
    public void greet() {
        System.out.println("greeting from direct Interface implementation");
    }
}

public class SAMImplementationDemo {
    // A static method to be used with method reference
    public static void sayHello() {
        System.out.println("hello from method reference");
    }

    public static void main(String[] args) {
        /**
         * 1. Implementation using Anonymous Inner class
         */
        MySAMInterface samAnonymous = new MySAMInterface() {
            @Override
            public void greet() {
                System.out.println("greetings from Anonymous inner class");
            }
        };
        samAnonymous.greet();

        /**
         * 2. Implementation using Lambda expression
         * a concise way to implement SAM interfaces
         */
        MySAMInterface lambdaImpl = () -> {
            System.out.println("lambda implementation for SAM");
        };

        lambdaImpl.greet();

        // 3. invoking SAM direct implementation MySAM
        MySAMInterface mySAM = new MySAM();
        mySAM.greet();

        // 4. implementing the SAM interface using Method Reference
        MySAMInterface methodReference = SAMImplementationDemo::sayHello;
        methodReference.greet();
    }
}