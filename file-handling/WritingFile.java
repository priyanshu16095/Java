package File_Handling;

import java.io.FileWriter;

public class WritingFile {
    public static void main(String[] args) {
        
        try {
            FileWriter writer = new FileWriter("file.txt");
            writer.write("Hello my name is Priyanshu Gupta.");
            writer.close();
            System.out.println("Sucessfully Written!");
        } catch(Exception e) {
            System.out.println("An exception has occured!");
            e.printStackTrace();
        }

    }
}
