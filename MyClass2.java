// 2) using RandomAccessFile class create a file.
// accept a message from user and write in a file.
// now read the message which u have stored in a file.
// now again accept a message and write in a file at the end of existing message.
// now read the entire content of file . ( u should be able to read both the messages now)
import java.io.*;
import java.util.*;

public class MyClass2 
{
    public static void main(String args[])
    {
         Scanner r = new Scanner(System.in);
        String line;
        // char ch [] =new char[line.length()];
        try
        {
            RandomAccessFile rf = new RandomAccessFile("C://Users//Satyakam//OneDrive//Dev//OneDrive//Documents//c-dac//nitin_sir//java//Day_12//File_Handling_1//Day_12_code//Abc2.txt", "rw");
            System.out.println("enter some text");
            line = r.nextLine();
            rf.seek(0);
            // for(int i; i<line.length(); i++)
            // {
            //     ch[i]=line.charAt(i);
            //     rf.writechar(ch);
            // }
            rf.writeUTF(line);
            rf.close();
           
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        try{
            RandomAccessFile rf = new RandomAccessFile("C://Users//Satyakam//OneDrive//Dev//OneDrive//Documents//c-dac//nitin_sir//java//Day_12//File_Handling_1//Day_12_code//Abc2.txt", "rw");
       
            line = rf.readLine();// readLine method is of BufferedReader class ,  
            //in this case reads text lines, and its return type is String
            System.out.println(line);

            rf.close();

        }
         catch (IOException e)
        {
            e.printStackTrace();
        }

        try
        {
            RandomAccessFile rf = new RandomAccessFile("C://Users//Satyakam//OneDrive//Dev//OneDrive//Documents//c-dac//nitin_sir//java//Day_12//File_Handling_1//Day_12_code//Abc2.txt", "rw");
            
            System.out.println("enter some text");
            line = r.nextLine();

            rf.seek(rf.length());
            // for(int i; i<line.length(); i++)
            // {
            //     ch[i]=line.charAt(i);
            //     rf.writechar(ch);
            // }
            rf.writeUTF(line);
            rf.close();
            r.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        try{
            RandomAccessFile rf = new RandomAccessFile("C://Users//Satyakam//OneDrive//Dev//OneDrive//Documents//c-dac//nitin_sir//java//Day_12//File_Handling_1//Day_12_code//Abc2.txt", "rw");
       
            while ((line = rf.readLine()) != null) {
                System.out.println(line);
            }


            rf.close();

        }
         catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}