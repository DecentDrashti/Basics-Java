/*
==================================================
             CUSTOM EXCEPTION IN JAVA
==================================================

Java provides many built-in exceptions such as:

    ArithmeticException
    NullPointerException
    IOException
    NumberFormatException

But sometimes our application has a specific
business rule that needs its own exception.

For example:

    InvalidAgeException
    InsufficientBalanceException
    InvalidMarksException
    InvalidPasswordException

A user-defined exception is called a
CUSTOM EXCEPTION.

--------------------------------------------------

HOW TO CREATE A CUSTOM EXCEPTION?

1. Create a class.
2. Extend Exception or RuntimeException.
3. Create a constructor.
4. Pass the message to the parent Exception class.

Example:

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

--------------------------------------------------

WHY EXTEND Exception?

Exception is the parent class for many exceptions.

By extending Exception, our class becomes an
exception class and can be used with:

    throw
    try-catch
    throws

--------------------------------------------------

IMPORTANT

Custom exceptions allow us to give meaningful
names and messages to application-specific
problems.

Instead of:

    Exception

we can have:

    InvalidAgeException

which makes the problem easier to understand.
==================================================
*/


// Creating our own exception
class InvalidAgeException extends Exception {

    // Constructor
    public InvalidAgeException(String message) {

        // Pass the message to the parent Exception class
        super(message);
    }
}


public class Custom_Exception {

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {

            // Throwing our custom exception
            throw new InvalidAgeException(
                    "Age must be 18 or above"
            );
        }

        System.out.println("You are eligible.");
    }


    public static void main(String[] args) {

        int age = 15;

        try {

            checkAge(age);

        }
        catch (InvalidAgeException e) {

            System.out.println("Exception: " + e.getMessage());

        }

        System.out.println("Program continues...");
    }
}
