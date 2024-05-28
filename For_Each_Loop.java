//used for looping through array
//for(int i = 0; i < array.length; i++) or for(int i:array) 
//for(type var : array_name)
public class For_Each_Loop {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
      System.out.println(i);
    }    
  }
}

