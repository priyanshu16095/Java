package src.java.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SmallestAndLargestString {
    @FunctionalInterface
    public interface Car {
        void start(String name);
    }

    @FunctionalInterface
    public interface checkEven {
        void check(int n);
    }

    public static void main(String[] args) {
        Car audiA4 = new Car() {
            @Override
            public void start(String name) {
                System.out.println(name + " Starting...");
            }
        };
        audiA4.start("Audi A4");

        checkEven c = new checkEven() {
            @Override
            public void check(int n) {
                if(n % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            }
        };
        c.check(4);

        checkEven d = (n) -> {
            if(n % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        };
        d.check(6);

    }

}
