import java.util.Scanner;

public class Fibonacci_nthTerm {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the term index : ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count < n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);

    }
}
