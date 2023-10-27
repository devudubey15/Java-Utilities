import java.io.*;
import java.util.*;

public class MyClassGPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "C://Users//Satyakam//OneDrive//Dev//OneDrive//Documents//c-dac//nitin_sir//java//Day_12//File_Handling_1//Day_12_code//MyFile.txt";

        try {
            // Create or open the file in read-write mode
            RandomAccessFile file = new RandomAccessFile(filePath, "rw");

            // Read and display the existing message, if any
            String existingMessage = file.readLine(); // readLine method is of BufferedReader class ,  
                                             //in this case reads text lines, and its return type is String
            if (existingMessage != null) {
                System.out.println("Existing Message: " + existingMessage);
            }

            //  Move the file pointer to the end of the file
            file.seek(file.length()); // in 

            // Accept a new message from the user and write it to the file
            System.out.println("Enter a new message to write to the file:");
            String newMessage = scanner.nextLine();
            file.writeBytes(newMessage + "\n");

            // Close the file
            file.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // Open the file for reading
            RandomAccessFile file = new RandomAccessFile(filePath, "r");

            // Read and print the entire content of the file
            System.out.println("Full Content of the File:");
            String line;
            while ((line = file.readLine()) != null) {
                System.out.println(line);
            }

            // Close the file
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
