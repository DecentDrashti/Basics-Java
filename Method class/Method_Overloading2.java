public class Method_Overloading2{
    //overloaded sum().this sum takes two int parameters
    public static int sum(int x,int y){
        return (x+y);
    }
    //overloaded sum().this sum takes three int parameters
    public static int sum(int x,int y,int z){
        return (x+y+z);
    }
    public static double sum (double x, double y){
        return (x+y);
    }
    //main method.. sum is sub method which is to be called with different parameter either with two parameter of int or with three paramter of int or with a paramter of double 
    public static void main(String[] args){
        int ans1=sum(5,2);
        int ans2=sum(5,2,6);
        double ans3=sum(5.8,6.4);
        System.out.println("int: with two parameter "+ans1);
         System.out.println("int: with three parameter "+ans2);
          System.out.println("double: with two parameter "+ans3);
    }
}