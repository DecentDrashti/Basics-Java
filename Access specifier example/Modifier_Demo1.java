//for theory pupose
//for classes:-
//non accesible modifier

//1.final:-The class cannot be inherited by other classes.
final class Vehicle {
  protected String brand = "Ford";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class Main extends Vehicle {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    Main myFastCar = new Main();
    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
  }
}
//Outputs
//compilation error:-cannot inherit from final Vehicle
//class Main extends Vehicle {

//2. abstract :-The class cannot be used to create objects (To access an abstract class, it must be inherited from another class.
// abstract class
abstract class Main {
  public String fname = "John";
  public String lname = "Doe";
  public String email = "john@doe.com";
  public int age = 24;
  public abstract void study(); // abstract method 
}

// Subclass (inherit from Person)
class Student extends Main {
  public int graduationYear = 2018;
  public void study() {
    System.out.println("Studying all day long");
  }
}
class Second {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Main)
    Student myObj = new Student(); 
    
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}
// final	Attributes and methods cannot be overridden/modified
// static	Attributes and methods belongs to the class, rather than an object
// abstract	Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from). You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters
// transient	Attributes and methods are skipped when serializing the object containing them
// synchronized	Methods can only be accessed by one thread at a time
// volatile	The value of an attribute is not cached thread-locally, and is always read from the "main memory"

