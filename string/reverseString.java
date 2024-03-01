package String;

public class reverseString {
    public static void main(String[] args) {
        String originalWord = "Hello";
        String reversedWord =  "";
        for(int i = 0; i < originalWord.length(); i++) {
            reversedWord = originalWord.charAt(i) + reversedWord;
            // reversedWord = reversedWord + originalWord.charAt(i) : WILL DISPALY ORIGINAL
        }
        System.out.println("Original String : " + originalWord);
        System.out.println("Reversed String : " + reversedWord);
    }
    
}
