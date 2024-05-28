//import java.util.*;
// Create a checkAge() method with an integer variable called age
public class Method_Eg{
static void checkAge(int age){
  //  Scanner sc=new Scanner(System.in);
  // System.out.println("enter the age")
  //  int age=sc.nextInt();
  

if(age<18){// If age is less than 18, print "Access denied"
    System.out.println("Access denied"); 
 } 
else{// If age is greater than, or equal to, 18, print "Access granted"
    System.out.println("Access granted"); 
  }

} 
public static void main(String[] args) { // Call the checkAge method and pass along an age of 20
  checkAge(12);
 }
}
