//Lets learn how to "create a file"

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors 
//else simply import java.io.* instead of both the above lines.
public class F2_Demo{
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());//output File created: filename.txt
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
//To create a file in a specific directory (requires permission), specify the path of the file and use double backslashes to escape the "\" character (for Windows). On Mac and Linux you can just write the path, like: /Users/name/filename.txt
//File myObj = new File("C:\\path\\filename.txt");