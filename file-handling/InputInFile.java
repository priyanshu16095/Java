package File_Handling;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class InputInFile {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        try {
            File file = new File("file.txt");
            FileWriter writer = new FileWriter("file.txt");

            System.out.print("Enter the number of lines: ");;
            int n = in.nextInt(); 
            System.out.println("Enter: ");
            for(int i = 0; i <= n; i++) {
                String content = in.nextLine();
                writer.write(content);
            }
            writer.close();
            System.out.println(file + " written sucessfully!");
        } catch(Exception e) {
            System.out.println("Error!");
        }

    }
}
