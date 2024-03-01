package String;

import java.util.Scanner;

public class traversingString {
    public static void main(String[] args) {
        // Substring in Java is a commonly used method of java. lang. String class that is used to create 
        // smaller strings from the bigger one.

        // String is an array of chars.

        // We define char in java program using single quote (') whereas we can define 
        // String in Java using double quotes (").

        // charAt() : Returns the character at the specified index (position)
        // endsWith() : Checks whether a string ends with the specified character(s)
        // ength()	: Returns the length of a specified string
        // toUpperCase() : Converts a string to upper case letters
        // trim() : Removes whitespace from both ends of a string

        // TRAVERSING THE STRING
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String word = in.next();
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            System.out.print(c + " ");
        }       
    }    
}
