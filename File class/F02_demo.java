//Lets learn about FileOutputStream
// it is an output stream for writing data to a file.
// on opening a read only file it will throw an exception.
class FileOutDemo{
    public static void main(String[]args){
        try {
            FileOutputStream fout=new FileOutputStream("abc.txt");
            String s="I am a beautiful and happy girl";
            byte b[]=s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("code is succefull");
        }catch(Exception e){
            System.out.println(e);
        }
    }

}