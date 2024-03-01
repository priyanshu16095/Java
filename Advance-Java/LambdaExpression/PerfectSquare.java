package src.java.LambdaExpression;

import java.util.function.Predicate;

public class PerfectSquare {
    public static void main(String[] args) {
        // LAMBDA EXPRESSION
        Predicate<Integer> isPerfectSquare = (num) -> {
            int sqrt = (int)Math.sqrt(num);
            return sqrt * sqrt == num;
        };

        // TEST THE LAMBDA EXPRESSION
        int n = 36;
        boolean result = isPerfectSquare.test(n);
        System.out.println(result);
    }
}
