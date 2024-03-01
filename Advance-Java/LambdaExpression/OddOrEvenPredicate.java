package src.java.LambdaExpression;

import java.util.Scanner;
import java.util.function.Predicate;

public class OddOrEvenPredicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();

        Predicate<Integer> isEven = (n) -> n % 2 == 0;

        if(isEven.test(num)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
