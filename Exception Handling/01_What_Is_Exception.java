/*
==================================================
             EXCEPTION HANDLING IN JAVA
==================================================

What is an Exception?

An exception is an unexpected event that occurs
during the execution of a program and interrupts
the normal flow of the program.

Example:

    int result = 10 / 0;

A number cannot be divided by zero, so Java
generates an ArithmeticException.

--------------------------------------------------

Why do we need Exception Handling?

Without exception handling, an exception can
terminate the program unexpectedly.

Example:

    System.out.println("Program Started");

    int result = 10 / 0;

    System.out.println("Program Ended");

The second print statement will never execute
because the exception stops the normal flow.

Exception handling allows us to handle such
problems gracefully and continue the program
when possible.

--------------------------------------------------

Common Exceptions in Java

1. ArithmeticException
   Occurs when an invalid arithmetic operation
   is performed.

   Example:
   int result = 10 / 0;


2. ArrayIndexOutOfBoundsException
   Occurs when we try to access an array index
   that does not exist.

   Example:
   int[] numbers = {10, 20, 30};
   System.out.println(numbers[5]);


3. NullPointerException
   Occurs when we try to use an object/reference
   that contains null.

   Example:
   String name = null;
   System.out.println(name.length());


4. NumberFormatException
   Occurs when we try to convert an invalid
   String into a number.

   Example:
   int number = Integer.parseInt("abc");


5. InputMismatchException
   Occurs when Scanner receives input of an
   unexpected type.

--------------------------------------------------

EXCEPTION VS ERROR

Both Exception and Error are subclasses of
Throwable.

                    Throwable
                    /        \
                   /          \
              Exception       Error

Exception:
• Usually represents problems that an application
  can handle.
• Examples: ArithmeticException, IOException.

Error:
• Usually represents serious problems related to
  the JVM or system.
• Applications generally should not try to handle
  these problems.

Examples:
• OutOfMemoryError
• StackOverflowError

--------------------------------------------------

TYPES OF EXCEPTIONS

Exceptions can broadly be divided into:

1. Checked Exceptions
2. Unchecked Exceptions

--------------------------------------------------

1. CHECKED EXCEPTIONS

Checked exceptions are checked by the compiler.

The programmer must either:
• Handle them using try-catch
OR
• Declare them using throws

Examples:
• IOException
• SQLException
• FileNotFoundException

--------------------------------------------------

2. UNCHECKED EXCEPTIONS

Unchecked exceptions are not checked by the
compiler.

They usually occur during program execution.

Examples:
• ArithmeticException
• NullPointerException
• ArrayIndexOutOfBoundsException
• NumberFormatException

Unchecked exceptions are subclasses of
RuntimeException.

--------------------------------------------------

IMPORTANT

Exception handling does NOT mean that we should
ignore errors.

It means that we should handle expected problems
in a controlled and meaningful way.

--------------------------------------------------

EXCEPTION HANDLING FLOW

Normal Program
      |
      v
  Exception?
    /     \
  No       Yes
  |         |
  v         v
Continue   Handle
Program   Exception

--------------------------------------------------

In the next examples, we will learn how to handle
exceptions using:

1. try
2. catch
3. finally
4. throw
5. throws
==================================================
*/


public class What_Is_Exception {

    public static void main(String[] args) {

        System.out.println("Program Started");

        // This statement causes an ArithmeticException
        int result = 10 / 0;

        System.out.println("Result: " + result);

        System.out.println("Program Ended");
    }
}


// Output:
//
// Program Started
// Exception in thread "main" java.lang.ArithmeticException: / by zero
