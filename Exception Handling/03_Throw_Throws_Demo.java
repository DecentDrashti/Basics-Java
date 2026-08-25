/*
==================================================
             THROW VS THROWS IN JAVA
==================================================

THROW
--------------------------------------------------

The 'throw' keyword is used to explicitly throw
an exception.

Syntax:

    throw new ExceptionType("message");

Example:

    throw new ArithmeticException("Invalid operation");

The programmer decides when and where to throw
the exception.

--------------------------------------------------

THROWS
--------------------------------------------------

The 'throws' keyword is used in a method declaration
to tell the caller that the method may throw an
exception.

Syntax:

    returnType methodName() throws ExceptionType {
        // code
    }

The 'throws' keyword does NOT actually throw the
exception. It only declares that the method may
throw it.

--------------------------------------------------

THROW vs THROWS

| throw                         | throws                       |
|-------------------------------|------------------------------|
| Actually throws an exception  | Declares possible exception  |
| Used inside a method/block    | Used in method declaration   |
| Throws one exception at a time| Can declare multiple ones    |
| Uses an exception object      | Uses exception class names   |

Example:

    throw new Exception("Error");

    void test() throws Exception {
    }

--------------------------------------------------

FLOW

throw:

    Condition
       ↓
    throw exception
       ↓
    Exception occurs
       ↓
    catch handles it

throws:

    Method
       ↓
    declares possible exception
       ↓
    Caller handles the exception
==================================================
*/


public class Throw_Throws_Demo {

    // 'throws' declares that this method may throw
    // an Exception.
    static void checkAge(int age) throws Exception {

        if (age < 18) {

            // 'throw' actually creates and throws
            // the exception.
            throw new Exception("Age must be 18 or above");

        }

        System.out.println("You are eligible.");
    }


    public static void main(String[] args) {

        int age = 15;

        try {

            checkAge(age);

        }
        catch (Exception e) {

            System.out.println("Exception: " + e.getMessage());

        }

        System.out.println("Program continues...");
    }
}
