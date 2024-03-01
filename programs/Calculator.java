import java.util.Scanner;

public class Calculator{
  public static void main(String[] args) {
    calc();
  }

  public static void calc() {
    Scanner in = new Scanner(System.in);
    int num1 = 0;
    int num2 = 0;
    int sum, sub, mul, div, result;

    System.out.println("---WELCOME TO CALCULATOR---");

    System.out.println("Choose the operator [ + | - | * | / ]");
    System.out.print("Enter : ");
    char operator = in.next().charAt(0);

    try {
        System.out.print("Enter the num1 : ");
        num1 = in.nextInt();
        System.out.print("Enter the num2 : ");
        num2 = in.nextInt();
    } catch(Exception e) {
        System.out.println("ERROR!");
    }

    switch (operator){
    case '+':
      result = num1 + num2;
      System.out.println(">> Sum is " + result);
      break;
    case '-':
      result = num1 - num2;
      System.out.println(">> Difference is " + result);
      break;
    case '*':
      result = num1 * num2;
      System.out.println(">> Multiplication is " + result);
      break;
    case '/':
      result = num1 / num2;
      System.out.println(">> Divison is " + result);
      break;
    default:
      System.out.println(">> Invalid operator!");
      break;
    }
  }


}
 
    