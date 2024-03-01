package src.java.LambdaExpression;

// https://www.w3resource.com/java-exercises/lambda/index.php#:~:text=14.,given%20string%20is%20a%20palindrome.&text=15.,even%20numbers%20in%20a%20list.

public class Main {
    @FunctionalInterface
    interface Car {
        void start(String name);
    }

    class Audi {
        public static void main(String[] args) {
            Car audiA4 = new Car() {
                @Override
                public void start(String name) {
                    System.out.println(name + ": Starting...");
                }
            };
            audiA4.start("Audi A4");

            Car audiQ3 = (String name) -> System.out.println(name + ": Starting...");
            audiQ3.start("Audi Q3");
        }
    }
}
