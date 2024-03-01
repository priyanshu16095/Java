package String;

import java.util.Scanner;

public class pallindromeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String word = in.next();
        String rev = "";
        for(int i = 0; i < word.length(); i++) {
             rev = word.charAt(i) + rev;
        }
        if(rev.equals(word)) {
            System.out.println("Pallindrome String!");
        } else {
            System.out.println("Not a Pallindrome String!");
        }
    }
}