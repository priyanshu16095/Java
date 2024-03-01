import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        while (true) {
            fact2();
        }
    }

    // O(n)
    public static void fact1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();

        for (int i = 0; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // O(sqrt(n))
    public static void fact2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
        System.out.println();
    }

}
