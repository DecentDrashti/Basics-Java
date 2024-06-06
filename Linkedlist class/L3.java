import java.util.LinkedList;

public class L3 { 
  public static void main(String[] args) { 
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    //cars.add("Mazda");
    // Use addLast() to add the item to the end
    cars.addLast("Mazda");
    System.out.println(cars);
    System.out.println(cars.size());
  } 
}