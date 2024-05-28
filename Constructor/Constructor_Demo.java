// Create a class
public class Constructor_Demo{
  int x;  // Create a class attribute x

  // Create a class constructor for the class
  public Constructor_Demo() {
    x = 5;  // Set the initial value for the class attribute x to 5
  }

  public static void main(String[] args) {
    // Create an myObj object of class (This will call the constructor)
    Constructor_Demo myObj = new Constructor_Demo(); 
    // Print the value of x
    System.out.println(myObj.x);
  }
}