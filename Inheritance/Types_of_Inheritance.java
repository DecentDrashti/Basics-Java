/*
=========================================
           TYPES OF INHERITANCE
=========================================

1. Single Inheritance
   One child class inherits one parent class.

   Animal
      ↓
     Dog

-----------------------------------------

2. Multilevel Inheritance
   A class inherits from a class that
   already inherits another class.

   Animal
      ↓
     Dog
      ↓
    Puppy

-----------------------------------------

3. Hierarchical Inheritance
   Multiple child classes inherit from
   the same parent class.

          Animal
         /      \
       Dog      Cat

-----------------------------------------

4. Multiple Inheritance
   A class inherits from more than one
   parent class.

        A     B
         \   /
           C

   Java DOES NOT support Multiple
   Inheritance using classes.

   Java supports it using Interfaces.

-----------------------------------------

5. Hybrid Inheritance
   Combination of two or more types of
   inheritance.

   Java DOES NOT support Hybrid
   Inheritance using classes because it
   involves Multiple Inheritance.

   Java supports it using Interfaces.

=========================================
*/
public class Types_Of_Inheritance {
    public static void main(String[] args) {

        System.out.println("Java supports:");
        System.out.println("1. Single Inheritance");
        System.out.println("2. Multilevel Inheritance");
        System.out.println("3. Hierarchical Inheritance");

        System.out.println("\nJava does NOT support:");
        System.out.println("4. Multiple Inheritance using classes");
        System.out.println("5. Hybrid Inheritance using classes");

        System.out.println("\nMultiple and Hybrid Inheritance can be achieved using Interfaces.");
    }
}
