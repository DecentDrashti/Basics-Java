/*
==================================================
              TRY-CATCH IN JAVA
==================================================

The try-catch block is used to handle exceptions
so that the program does not terminate
unexpectedly.

--------------------------------------------------

Syntax:

try {
    // Code that may cause an exception
}
catch (ExceptionType e) {
    // Code to handle the exception if no exception occur the code inside the catch will not run 
}

--------------------------------------------------

How it works:

1. Java executes the code inside the try block.

2. If no exception occurs:
   - The catch block is skipped.
   - Program continues normally.

3. If an exception occurs:
   - The remaining code inside try is skipped.
   - Java searches for a matching catch block.
   - The matching catch block is executed.
   - Program can then continue.

--------------------------------------------------

MULTIPLE CATCH

A try block can have multiple catch blocks
to handle different types of exceptions.

Example:

try {
    // Code
}
catch (ArithmeticException e) {
    // Handle arithmetic exception
}
catch (ArrayIndexOutOfBoundsException e) {
    // Handle array exception
}

--------------------------------------------------

FINALLY

The finally block is used for code that should
generally execute after try/catch processing,
whether an exception occurs or not.

Syntax:

try {

}
catch (Exception e) {

}
finally {

}

--------------------------------------------------

IMPORTANT

• A try block must be followed by catch or finally.
• A catch block handles a specific exception.
• Multiple catch blocks can be used.
• finally is generally used for cleanup operations.
==================================================
*/


public class Try_Catch_Demo {

    public static void main(String[] args) {

        System.out.println("Program Started");

        try {

            int a = 10;
            int b = 0;

            System.out.println("Result: " + (a / b));

            // This statement will not execute because
            // the exception occurs before it.
            System.out.println("Inside try block");

        }
        catch (ArithmeticException e) {

            System.out.println("Cannot divide a number by zero.");

        }

        System.out.println("Program Continued");

        System.out.println("\n--- Multiple Catch Example ---");

        try {

            int[] numbers = {10, 20, 30};

            System.out.println(numbers[5]);

        }
        catch (ArithmeticException e) {

            System.out.println("Arithmetic error occurred.");

        }
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid array index.");

        }

        System.out.println("\n--- Finally Example ---");

        try {

            System.out.println("Inside try block.");

        }
        catch (Exception e) {

            System.out.println("Exception occurred.");

        }
        finally {

            System.out.println("Finally block executed.");

        }

        System.out.println("\nProgram Ended");
    }
}
//Output
// Program Started
// Cannot divide a number by zero.
// Program Continued


// --- Multiple Catch Example ---
// Invalid array index.


// --- Finally Example ---
// Inside try block.
// Finally block executed.


// Program Ended
