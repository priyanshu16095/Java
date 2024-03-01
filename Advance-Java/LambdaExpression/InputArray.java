package src.java.LambdaExpression;

import java.util.Scanner;

public class InputArray {
    @FunctionalInterface
    public interface Array {
        void inpArr(int n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int num = in.nextInt();

        Array a = (n) -> {
          int[] arr = new int[n];
          for(int i = 0; i < n; i++) {
              System.out.print("Enter the element: ");
              arr[i] = in.nextInt();
          }
          System.out.println("The array created is: ");
          for(int i = 0; i < n; i++) {
              System.out.print(arr[i] + " ");
          }
        };
        a.inpArr(num);
    }
}
