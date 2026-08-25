/*
==================================================
             POLYMORPHISM IN JAVA
              METHOD OVERRIDING
==================================================

What is Method Overriding?

Method overriding occurs when a child class
provides its own implementation of a method that
is already defined in its parent class.

The method in the child class must have the same:

• Method name
• Parameters
• Return type (or compatible return type)

--------------------------------------------------

Example:

Parent Class:

    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

Child Class:

    class Dog extends Animal {
        void sound() {
            System.out.println("Dog barks");
        }
    }

The Dog class overrides the sound() method
of the Animal class.

--------------------------------------------------

WHY DO WE NEED METHOD OVERRIDING?

Different child classes may need different
implementations of the same operation.

For example:

Animal → sound()

Dog → Bark
Cat → Meow
Cow → Moo

The method name remains the same, but the
behavior changes.

This is called POLYMORPHISM.

--------------------------------------------------

@OVERRIDE ANNOTATION

Java provides the @Override annotation to tell
the compiler that we are intentionally overriding
a parent class method.

Example:

@Override
void sound() {
    System.out.println("Dog barks");
}

Using @Override is recommended because the
compiler can detect mistakes in the method
signature.

--------------------------------------------------

RUNTIME POLYMORPHISM

Method overriding is an example of
runtime polymorphism.

The method that will actually execute is
determined at runtime based on the object.

Example:

Animal a = new Dog();

a.sound();

Although the reference type is Animal, the actual
object is Dog.

Therefore:

Dog's sound() executes.

--------------------------------------------------

IMPORTANT

Method overriding requires inheritance.

The child class must inherit from the parent
class.

==================================================
*/


// Parent class
class Animal {

    void sound() {

        System.out.println("Animal makes a sound");
    }
}


// Child class
class Dog extends Animal {

    @Override
    void sound() {

        System.out.println("Dog barks");
    }
}


// Another child class
class Cat extends Animal {

    @Override
    void sound() {

        System.out.println("Cat meows");
    }
}


public class Method_Overriding {

    public static void main(String[] args) {

        // Parent class reference
        Animal animal = new Animal();

        // Child class objects
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Normal Method Calls:");

        animal.sound();
        dog.sound();
        cat.sound();


        System.out.println("\nRuntime Polymorphism:");

        // Parent reference pointing to Dog object
        Animal a1 = new Dog();

        // Parent reference pointing to Cat object
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
    }
}
