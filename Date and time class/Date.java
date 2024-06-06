import java.time.LocalDate;  // import the LocalDate class 
//for including both date and time, use import java.time.LocalDateTime;

public class Date {  
  public static void main(String[] args) {  
    LocalDate myObj = LocalDate.now();  // Create a date object
    System.out.println(myObj);  // Display the current date 
    //myObj.getYear() + "-" + myObj.getMonthValue() + "-" + myObj.getDayOfMonth());
  }  
}  
