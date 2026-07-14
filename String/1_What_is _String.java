/*
==================================================
                STRING IN JAVA
==================================================

A String is a sequence of characters used to store
and manipulate text.

Examples:
"Hello"
"Java"
"Welcome"

Unlike primitive data types, String is an object.

Strings in Java are immutable, which means once a
String object is created, its value cannot be changed.

--------------------------------------------------
Example:

String s = "Hello";
s = "ABC";

Here, the original String "Hello" is NOT modified.

Instead:
• "Hello" remains unchanged.
• A new String object "ABC" is created.
• The reference variable 's' now points to "ABC".

This behavior is because Strings are immutable.

--------------------------------------------------

Ways to Create a String

1. Using String Literal

String name = "Drashti";

2. Using new Keyword

String name = new String("Drashti");

--------------------------------------------------

Why do we use Strings?

✔ Store names
✔ Store addresses
✔ Store passwords
✔ Store emails
✔ Display messages

==================================================
*/

public class What_Is_String {

    public static void main(String[] args) {

        String language = "Java";

        System.out.println("Programming Language : " + language);
    }
}
