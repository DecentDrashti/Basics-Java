/*
==================================================
             POLYMORPHISM IN JAVA
              METHOD OVERLOADING
==================================================

What is Polymorphism?

Polymorphism means "many forms".

In Java, polymorphism allows the same method name
to perform different tasks depending on how it
is used.

There are two main types of polymorphism:

1. Compile-time Polymorphism
   → Method Overloading

2. Runtime Polymorphism
   → Method Overriding

--------------------------------------------------

METHOD OVERLOADING

Method overloading means having multiple methods
with the same name but different parameters.

The parameters can differ in:

• Number of parameters
• Type of parameters
• Order of parameters

Example:

    add(int a, int b)

    add(int a, int b, int c)

Both methods have the same name 'add', but they
accept different parameters.

Java determines which method to call based on
the arguments passed to it.

--------------------------------------------------

IMPORTANT

Changing only the return type does NOT create
method overloading.

For example, this is NOT valid overloading:

    int add(int a, int b)

    double add(int a, int b)

The parameters are exactly the same.

--------------------------------------------------

METHOD OVERLOADING = COMPILE-TIME POLYMORPHISM

The compiler determines which overloaded method
should be called during compilation.

==================================================
*/


public class Method_Overloading {

    // Method with two int parameters
    static int add(int a, int b) {

        return a + b;
    }


    // Same method name but three int parameters
    static int add(int a, int b, int c) {

        return a + b + c;
    }


    // Same method name but different parameter types
    static double add(double a, double b) {

        return a + b;
    }


    // Same method name but different order of parameters
    static String add(String a, int b) {

        return a + b;
    }


    static String add(int a, String b) {

        return a + b;
    }


    public static void main(String[] args) {

        System.out.println("Two integers: " + add(10, 20));

        System.out.println("Three integers: " + add(10, 20, 30));

        System.out.println("Two doubles: " + add(10.5, 20.5));

        System.out.println("String and integer: " + add("Age: ", 20));

        System.out.println("Integer and string: " + add(20, " students"));
    }
}
//output:
// Two integers: 30
// Three integers: 60
// Two doubles: 31.0
// String and integer: Age: 20
//Integer and string: 20 students
