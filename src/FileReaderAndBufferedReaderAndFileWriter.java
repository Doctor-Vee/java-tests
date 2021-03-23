import java.io.*;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Scanner;

public class FileReaderAndBufferedReaderAndFileWriter {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:/Users/victo/Documents/readme.txt");
        BufferedReader buff = new BufferedReader(reader); // This line is optional .. you can choose to leave out BufferedReader and just use reader as the argument for "new Scanner()" in the next line
        Scanner scanner = new Scanner(buff);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        reader.close();
        buff.close(); // If you used BufferedReader, you'd have to close it as well
        System.out.println("--------------------- DONE READING AND PRINTING -------------------");

        System.out.println("About to write to file ...");
        Calendar cal = Calendar.getInstance();
        Timestamp now = new Timestamp(cal.getTimeInMillis());
        FileWriter writer = new FileWriter("C:/Users/victo/Documents/readme3.txt", true);
        writer.write("Hello World to my Doctor Vee\nVictor\n" + now);
        writer.write("\n-------------------------------\n");
        writer.close();
        System.out.println("----------------------- DONE WRITING TO FILE ------------------------");
    }
}

