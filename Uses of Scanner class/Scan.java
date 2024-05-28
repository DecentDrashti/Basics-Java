//not a programme but a basic knowledge of programme on how to scan it using scanner in java
//how to scan an array 
 System.out.println("enter the array length");
        int n=sc.nextInt();
        int[] strs = new int[n]; // create an array of size n
       for (int d = 0; d < strs.length; i++) {
        System.out.println("Enter an integer:");
         strs[d] = sc.nextInt(); // read an integer from the user and store it in the array
       }
       //2d array
    Scanner scan = new Scanner(System.in);
System.out.println("Enter the number of rows:");
int rows = scan.nextInt(); // read the number of rows from the user
System.out.println("Enter the number of columns:");
int cols = scan.nextInt(); // read the number of columns from the user
String[][] array = new String[rows][cols]; // create a two-dimensional array of strings
for (int i = 0; i < rows; i++) {
  for (int j = 0; j < cols; j++) {
    System.out.println("Enter a string:");
    array[i][j] = scan.next(); // read a string from the user and store it in the array
  }
}
// scan a string
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string:");
        String userInput = myObj.nextLine(); // Read user input
        System.out.println("You entered: " + userInput); // Output user input
    }
}