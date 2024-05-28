//Lets see the basic information
import java.io.File;  // Import the File class

File myObj = new File("filename.txt"); // Specify the filename
//boolean method of file class are as follows
1.canRead() checks whether the file is readable or not.
2.canWrite() checks whether the file is writable or not.
3.createNewFile() creates an empty file.
4.delete() Deletes a file.
5.exists() Tests whether the file exists.
6.mkdir() Creates a directory.
7.isAbsolute() checks whether this abstract pathname is absolute.
8.isDirectory() checks whether the file denoted by this abstract pathname is a directory.
9.isfile() checks wwhether the file denoted by this abstract path name is a normal file.
//string method of file class are as follows
1.getName()	Returns the name of the file.
2.getAbsolutePath()	Returns the absolute pathname of the file.
3.list() returns an array of strings naming the files and directories in the directory denoted by this abstract pathname.
//long method
1.length()	Returns the size of the file in bytes.
2.lastModified() returns the time when this file is lastly modified.