//A HashSet is a collection of items where every item is unique, and it is found in the java.util package.
// Import the HashSet class
import java.util.HashSet;

public class H1 {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
//methods are contains() remove() and clear().
//size is a method that returns the number of elements in the HashSet.
//contains is boolean method
//remove removes an single element.
//clear removes all elements.