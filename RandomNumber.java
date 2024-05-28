public class RandomNumber{
  public static void main(String[] args) {
    int randomNum = (int)(Math.random() * 101);  // 0 to 100 else for random number between 0.0-0.1 you can simply use Math.random()
    System.out.println(randomNum);
  }
}
