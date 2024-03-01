import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        while (true) {
            Fibo();
        }
    }
    public static void Fibo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Fibonacci series till how many terms: ");
        int n = in.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.print("Fibonacci series till " + n + " terms : ");

        for (int i = 0; i <= n; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
    }
}
