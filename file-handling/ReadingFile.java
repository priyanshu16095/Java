package File_Handling;
import java.util.Scanner;
import java.io.File;

public class ReadingFile {
    public static void main(String[] args) {
        
        try {
            File file = new File("file.txt");
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch(Exception e) {
            System.out.println("An exception has occured!");
            e.printStackTrace();
        }

    }
}
