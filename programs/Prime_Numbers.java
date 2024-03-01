
import java.util.Scanner;

public class Prime_Numbers {
    public static void main(String[] args) {
        while (true) {
            prime_num();
        }
    }

    public static void prime_num() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        boolean flag = false;
        for (int i = 2; i < n; i++) {
            if (n % 2 == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(n + " is a prime a number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

}
