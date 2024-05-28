//A package in Java is used to group related classes.(think it as a folder in a file directory.)
//uses:-
//-avoid name conflicts,
//-to write a better maintainable code.
//Packages are divided into two categories:-
//-Built-in Packages (packages from the Java API)-> prewritten classes that are free to use in jdk library is divided into package an classes means you can import any one 
//-User-defined Packages (create your own packages)
import java.util.Scanner;   // Import a single class  java package n util is name of package scanner is a class
import package.name.*;   // Import the whole package
for user defined packages java uses a file System directory to store them.
└── root
  └── mypack
    └── MyPackageClass.java
#to compile the package:-
javac -d . MyPackageClass.java
//The -d keyword specifies the destination for where to save the class file. You can use any directory name, like c:/user (windows), or, if you want to keep the package within the same directory, you can use the dot sign ".", like in the example above.
When we compiled the package in the example above, a new folder was created, called "package_name".

To run the MyPackageClass.java file, write the following:
C:\Users\Your Name>java package_name.MyPackageClass

