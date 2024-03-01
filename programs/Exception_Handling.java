    import java.util.Scanner;

    public class Exception_Handling {
    public static void main(String[] args) {
        while(true) {
            sum();
        }
    }

    public static void sum() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter the num01 : ");
            int num1 = in.nextInt();
            System.out.print("Enter the num02 : ");
            int num2 = in.nextInt();
            int div = num1/num2;
            System.out.println(div);
        } catch(ArithmeticException e) {
            System.out.println("Enter an integer, IDIOT!");
        } finally {
            System.out.println("You don't know this basic divison, IDIOT!");
        }
        System.out.println();

    }
    }