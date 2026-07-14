public class StringBuilder_Demo {

    public static void main(String[] args) {

        // Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Original String : " + sb);

        // append() - Adds text at the end
        sb.append(" Java");
        System.out.println("After append() : " + sb);

        // insert() - Inserts text at the specified index
        sb.insert(5, " Programming");
        System.out.println("After insert() : " + sb);

        // replace() - Replaces characters from start index to end index
        sb.replace(6, 17, "World");
        System.out.println("After replace() : " + sb);

        // delete() - Deletes characters from start index to end index
        sb.delete(5, 11);
        System.out.println("After delete() : " + sb);

        // reverse() - Reverses the String
        sb.reverse();
        System.out.println("After reverse() : " + sb);

        // reverse() again to restore the original order
        sb.reverse();

        // length() - Returns the total number of characters
        System.out.println("Length : " + sb.length());

        // charAt() - Returns the character at the specified index
        System.out.println("Character at index 1 : " + sb.charAt(1));

        // capacity() - Returns the current capacity of StringBuilder
        System.out.println("Capacity : " + sb.capacity());

        // setCharAt() - Changes the character at the specified index
        sb.setCharAt(0, 'h');
        System.out.println("After setCharAt() : " + sb);

        // deleteCharAt() - Deletes a single character
        sb.deleteCharAt(0);
        System.out.println("After deleteCharAt() : " + sb);

        // substring() - Returns a part of the String
        System.out.println("Substring : " + sb.substring(0, 4));

        // toString() - Converts StringBuilder to String
        String str = sb.toString();
        System.out.println("Converted to String : " + str);
    }
}
