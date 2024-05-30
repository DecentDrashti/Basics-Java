public class Array2d_Demo{
   public static void main(String[] args) {
     int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7, 8} };
     for (int i = 0; i < myNumbers.length; i++) {
      System.out.print("|");
        for(int j = 0; j < myNumbers[i].length; j++) {
         if(j>=1){
         System.out.print("\t");
         }
          System.out.print(myNumbers[i][j]);
         //  if(j<4){
          System.out.print("\t");
         //  }
        }
         System.out.println("\b\b\b\b\b\b|");
     }
   }
}
