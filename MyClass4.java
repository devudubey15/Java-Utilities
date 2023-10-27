// 4) Write a file copy program using unicode character streams.
// ( FileWriter and FileReader )
import java.io.*;
import java.util.*;
public class MyClass4
{
    public static void main(String[] args)
    {   Scanner sc = new  Scanner(System.in);
        String Sourcepath= "C://Users//Satyakam//OneDrive//Dev//OneDrive//Documents//c-dac//nitin_sir//java//Day_12//File_Handling_1//Day_12_code//Abc4.txt";
        String DestinationPath =  "C://Users//Satyakam//OneDrive//Dev//OneDrive//Documents//c-dac//nitin_sir//java//Day_12//File_Handling_1//Day_12_code//Abc4Copy.txt";
        try
        {
            FileWriter filewrite = new FileWriter(Sourcepath);
            String mssg = sc.nextLine();
            char ch[] = mssg.toCharArray();
            for(int i=0;i<mssg.length();i++)
            {
                filewrite.write(ch[i]);
                
                
            }
            filewrite.close();
                sc.close();
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }
        try 
        {
            FileReader reader = new FileReader(Sourcepath);
            char ch1[]= new char[(int)new File(Sourcepath).length()];
            int len = reader.read(ch1); 
            // for(int i=0; i<len; i++)
            // {
            //     System.out.print("string from file 4: "+ch1[i]);
                
            // }
            System.out.println(ch1);
            reader.close();
            FileWriter copy = new FileWriter(DestinationPath);
            for(int i=0; i<len; i++)
            {
                copy.write(ch1[i]);
                
            }
            copy.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            FileReader reader = new FileReader(DestinationPath);
            int k = (int) new File(DestinationPath).length();
            char ch2[] = new char[k];
            reader.read(ch2);
            // for(int i = 0; i < k; i++)
            // {
            //     System.out.print("copied sting" + ch2[i]);
            // } 
            System.out.println(ch2);
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}