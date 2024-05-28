import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");//array list use the method of add to add an value in the index of array list. volvo will be at index 0.
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    //to get the value stored at particular index we use get() method.
    cars.get(1);//output will be bmw

    //to modify the value at particular index we use set method.
    cars.set(index_no," modified name");
    //to remove an elements from particular index we use remove method
    cars.remove(index_no);
    //and to remove all the element simply use clear method 
    cars.clear();
    //length 
    cars.size();
  }
}