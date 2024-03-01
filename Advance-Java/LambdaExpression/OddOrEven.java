package src.java.LambdaExpression;

public class OddOrEven {
    @FunctionalInterface
    public interface checkEven {
        void checking(int num);
    }
    public static void main(String[] args){
        checkEven a = new checkEven() {
            @Override
            public void checking(int num) {
                if(num % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            }
        };

        checkEven b = (int num) -> {
            if(num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        };

    }
}
