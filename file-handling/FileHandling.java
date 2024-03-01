package File_Handling;
import java.io.File;

// Input Stream: superclass of all input streams
//               used to read data from numerous input devices
//               its subclasses are used to read data

// Output Stream: superclass of all output streams
//                used to write data to numerous output devices
//                it is an abstract class

public class FileHandling {
    public static void main(String[] args) {
        File file = new File("file.txt");
        System.out.println(file);
        System.out.println("File created!");

        // InputStream inputStream = new FileInputStream(file);
        // OutputStream obj = new FileOutputStream(file);
    }
    
}
