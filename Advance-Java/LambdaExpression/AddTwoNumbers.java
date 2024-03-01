package src.java.LambdaExpression;

public class AddTwoNumbers {
    @FunctionalInterface
    interface Add {
        void adding(int a, int b);
    }
    public static void main(String[] args) {
        Add add = (int a, int b) -> System.out.println(a + b);
        add.adding(2, 3);
    }
}
