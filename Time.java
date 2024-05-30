import java.time.LocalTime;  // import the LocalTime class

public class Time {  
  public static void main(String[] args) {  
    LocalTime myObj = LocalTime.now();
    System.out.println(myObj);//myObj.getHour() + ":" + myObj.getMinute() + ":" + myObj.getSecond());
  }  
}  