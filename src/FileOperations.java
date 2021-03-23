import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) throws IOException {

        File file3 = new File("C:/Users/victo/Documents/readme3.txt");
        System.out.println("Exists: " + file3.exists());
        System.out.println("File: " + file3.isFile());
        System.out.println("Folder: " + file3.isDirectory());
        if(file3.createNewFile()){
            System.out.println("The file has been created with the name: " + file3.getName());
        } else {
            System.out.println("This file already exists: " + file3.getAbsolutePath() + " with a size of " + file3.length() + " bytes");
        }
        System.out.println("Readable: " + file3.canRead());
        System.out.println("Writable: " + file3.canWrite());
    }
}
