package File_Handling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        
        File file = new File("file.txt");
        if(file.delete()) {
            System.out.println("File deleted!");
        } else {
            System.out.println("File not deleted!");
        }

    }
}
