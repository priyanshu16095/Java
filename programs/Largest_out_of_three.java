import java.util.Scanner;
public class Largest_out_of_three {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number_1 : ");
        int num_1 = in.nextInt();
        System.out.print("Enter the number_2 : ");
        int num_2 = in.nextInt();
        System.out.print("Enter the number_3 : ");
        int num_3 = in.nextInt();

        if (num_1 > num_2 && num_1 > num_3){
            System.out.print("The largest number is : ");
            System.out.println(num_1);
        }
         if (num_2 > num_1 && num_2 > num_3){
            System.out.print("The largest number is : ");
            System.out.println(num_2);
        }
         if (num_3 > num_2 && num_3 > num_1){
            System.out.print("The largest number is : ");
            System.out.println(num_3);
        }

        // Another way 
        System.out.println("Enter the number_1 : ");
        int n_1 = in.nextInt();
        System.out.println("Enter the num_2 : ");
        int n_2 = in.nextInt();
        System.out.println("Enter the numbr_3 : ");
        int n_3 = in.nextInt();

        int max =  n_1;
        if (n_2 > max){
            max = n_2;
        }
        if (n_3 > max){
            max = n_3;
        }
        System.out.println("The largest number is : " + max);

    }
}

