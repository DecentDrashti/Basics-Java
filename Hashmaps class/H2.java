//to get the value of a key, use the get() method.
import java.util.HashMap;

public class H2 {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities.get("England"));
  }
}
//To remove an item, use the remove() method and refer to the key:
//To remove all items, use the clear() method:
//To find out how many items there are, use the size() method
