/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rajes
 */
class Base {

    public void print() {
        System.out.println("HELLO");
    }
}

class Derived extends Base {

    @Override
    public void print() {
        System.out.println("WELCOME");
    }

    public void greet() {
        System.out.println("HI");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {
        Base base = new Derived();
        base.print();                                            // Printing WELCOME

        Derived derived = new Derived();
        derived.print();                                         // Printing WELCOME

        Base actualBase = new Base();
        actualBase.print();                                      // Printing HELLO

        //base.greet();                                          // Error : cannot find symbol
        //Derived derived = (Derived) new Base();                // Runtime Exception in thread "main" java.lang.ClassCastException: class Base cannot be cast to class Derived (Base and Derived are in unnamed module of loader 'app')
        //derived.print();
        //derived.greet(); 
    }
}
