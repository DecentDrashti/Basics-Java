public class Object_Demo{
    int x=5;
    public static void main(String[]args){
       Object_Demo myObj=new Object_Demo();//created an object
       //it can be modify here by myObj.x=2;
       //but if initial variable define is final then it can not be change 
       //final keyword wont change the vaue even if you try to do it will show an error i.e compiler error
       System.out.println(myObj.x);
    }
}