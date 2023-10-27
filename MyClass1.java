// 1)accept 10 characters from a user ( use Scanner).
// store these 10 characters in a file. (FileWriter)
// Now open a file and read all these characters.

import java.util.*;
import java.io.*;

public class MyClass1
{
    public static void main(String args[])
    {
        char ch[] = new char[10];
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
         
            
        
       try
        {   
            FileWriter fileWriter = new FileWriter("C://Users//Satyakam//OneDrive//Dev//OneDrive//Documents//c-dac//nitin_sir//java//Day_12//File_Handling_1//Day_12_code//ABC.txt");
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
            for(int i = 0; i <10;i++)
            {
                ch[i] = line.charAt(i);
                bufferWriter.write(ch[i]);
            }
            
            bufferWriter.close();
            sc.close();
        }
        catch(IOException  e)
        {
            e.printStackTrace();
        }
        try{
            FileReader reader = new FileReader("C://Users//Satyakam//OneDrive//Dev//OneDrive//Documents//c-dac//nitin_sir//java//Day_12//File_Handling_1//Day_12_code//ABC.txt");
            BufferedReader br = new BufferedReader(reader);
           br.read(ch,0,10);
            String s = new String(ch,0,10);
            System.out.println(s);

            // OR

            // for (int i = 0; i < 10; i++) {
            //     int charCode = br.read();
            //     if (charCode != -1) {
            //         ch[i] = (char) charCode;
            //         System.out.println(ch[i]);
            //     }
            br.close();
        }
        catch(IOException  e)
        {
            e.printStackTrace();
        }


    }
}