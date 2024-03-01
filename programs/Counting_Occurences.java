import java.util.Scanner;

public class Counting_Occurences {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        System.out.print("Enter the target element : ");
        int target = in.nextInt();

        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if (rem == target){
                count++;
            }
            n /= 10;
        }
        System.out.printf("Occured %s times", count);
    }
}
