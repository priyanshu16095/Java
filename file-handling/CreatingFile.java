package File_Handling;
import java.io.IOException;
import java.io.File;

public class CreatingFile {
    public static void main(String[] args) {
        
        try {
            File file = new File("file.txt");
            if(file.createNewFile()) {
                System.out.println("File created!");
            } else {
                System.out.println("File already exists!");
            }
        } catch(IOException e) {
            System.out.println("Some exception has occured!");
            e.printStackTrace();
        }

    }
}
