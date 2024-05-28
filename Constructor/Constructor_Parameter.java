public class Constructor_Parameter {
  int modelYear;
  String modelName;

  public Main(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Main myCar = new Main(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}

// Outputs
// 1969 Mustang

// public class Main {
//   int x;

//   public Main(int y) {
//     x = y;
//   }

//   public static void main(String[] args) {
//     Main myObj = new Main(5);
//     System.out.println(myObj.x);
//   }
// }

// Outputs 5