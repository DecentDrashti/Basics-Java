//Include only the commonly used methods first.
public class String_Methods {

    public static void main(String[] args) {

        String text = "Hello Java";

        System.out.println(text.length());

        System.out.println(text.toUpperCase());

        System.out.println(text.toLowerCase());

        System.out.println(text.charAt(1));

        System.out.println(text.indexOf("Java"));

        System.out.println(text.contains("Hello"));

        System.out.println(text.replace("Java", "World"));

       /* ==================================================
            String Concatenation IN JAVA
        ==================================================*/
        String firstName = "Drashti";
        String lastName = "Ruparelia";

        System.out.println(firstName + " " + lastName);

        System.out.println(firstName.concat(" " + lastName));


    }

}
//output:
// 10
// HELLO JAVA
// hello java
// e
// 6
// true
// Hello World
//Drashti Ruparelia
//Drashti Ruparelia
