
import java.util.Scanner;

public class Case_Check {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter  : ");
        char ch = in.next().trim().charAt(0);
        System.out.print("The first alphabet is : ");
        System.out.println(ch);

        if (ch > 'a' && ch > 'z') {
        } else {
            System.out.println("Lower Case");
            System.out.println("Upper Case");
        }

    }
}
