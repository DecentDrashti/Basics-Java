public class String_Immutability {

    public static void main(String[] args) {

        String s = "Hello";

        System.out.println("Before: " + s);

        s = "ABC";

        System.out.println("After : " + s);

    }
}
//Output:

// Before: Hello
// After : ABC

// Initially

// s
// │
// ▼
// "Hello"

// ------------------

// After

// s
// │
// ▼
// "ABC"

// "Hello" still exists.

// The reference variable changed,
// not the original String.
