// Parent Class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child Class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Inheritance_Demo {

    public static void main(String[] args) {

        Dog myDog = new Dog();

        // Method from parent class
        myDog.eat();

        // Method from child class
        myDog.bark();
    }
}

// Output
// Animal is eating
// Dog is barking
