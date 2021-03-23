import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class FileInputStreamAndFileOutputStream {
    public static void main(String[] args) throws IOException {
        // File Output Stream
        FileOutputStream fos = new FileOutputStream("doctorVee.txt", true); // the true means that it should append instead of overwriting
        PrintWriter pw = new PrintWriter(fos);
        LocalDateTime now = LocalDateTime.now();
        pw.println("Doctor Vee is writing to a file sha o");
        pw.println("Yeah... That's true");
        pw.println("The time is " + now);
        pw.println("-------------------------------------------------------------------------------------------");
        pw.close();
        System.out.println("Done Printing to file");

        // File Input Stream
        FileInputStream fis = new FileInputStream("C:/Users/victo/Documents/readme.txt");
        Scanner scanner = new Scanner(fis);
        StringBuilder received = new StringBuilder();
        while (scanner.hasNextLine()) {
            received.append(scanner.nextLine());
            received.append("\n");
        }
        System.out.println(received);
        System.out.println("Done Reading from file and printing to screen");
    }
}
