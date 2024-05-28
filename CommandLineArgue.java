Syntax: Integer.parseInt(String s);
Syntax:Double.parseDouble(String s);
String s="156"; //156 is not a number it is string;
System.out.println(s+1); //output:1561 :”156″+1=1561 string concatenation.

int x=Integer.parseInt(“156”);
System.out.println(x+1); //output:157 :156+1=157

//without command line arguement(parse)  it will consider number as string and so it will add the number 1 behiend if we give an input as 10 20 the output would be 101 201
class CommandLineArgue
{
  public static void main(String args[])
  {

   System.out.println(args[0]+1);
   System.out.println(args[1]+1);


  }
}
//with parse it will consider number as number 
class CommandLineArgue
{
  public static void main(String args[])
  {
  int a=Integer.parseInt(args[0]);//"10" convert to 10 and it will store in a
  int b=Integer.parseInt(args[1]);//"20" convert to 20 and it will store in b
   System.out.println(a+1);
   System.out.println(b+1);


  }
}
