// 3) write a file copy program using byte streams.
// ( FileOutputStream and FileInputStream )
import java.io.*;

public class MyClass3
{
        public static void main(String args[])
        {   
            
            String path = "C://Users//Satyakam//OneDrive//Dev//OneDrive//Documents//c-dac//nitin_sir//java//Day_12//File_Handling_1//Day_12_code//Abc3.txt";
           File F = new File(path);
            try( FileOutputStream file = new FileOutputStream (path))
           {    
                byte b1[] = new byte[100];
                System.out.println("enter the data ");
                int k = System.in.read(b1); // read from user into byte array b 
                //System.in is an instance of the InputStream class in Java, which is used for reading 
                // input from a source. In the case of System.in, it represents the standard input stream, 
                //  typically associated with the keyboard or other input devices.
                file.write(b1,(int)F.length(),k);
                
           }
           catch(IOException ie)
           {
                ie.printStackTrace();
           }

            try(FileInputStream file1 = new FileInputStream (path))
            {
                byte b2[] = new byte[100];
                file1.read(b2);
                String ss = new String(b2);
                System.out.println("ss: " + ss);
                file1.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }

            String path1 = "C://Users//Satyakam//OneDrive//Dev//OneDrive//Documents//c-dac//nitin_sir//java//Day_12//File_Handling_1//Day_12_code//Abc3copy.txt";
           try( FileOutputStream file = new FileOutputStream (path1))
           {    FileInputStream file2 = new FileInputStream (path);
                byte b3[] = new byte[(int)F.length()];
                int k = file2.read(b3); 
                file.write(b3,0,k);
                file.close();
                file2.close();
                
           }
           catch(IOException ie)
           {
                ie.printStackTrace();
           }

            try(FileInputStream file1 = new FileInputStream (path1))
            {
                byte b4[] = new byte[(int)F.length()];
                file1.read(b4);
                String ss1 = new String(b4);
                System.out.println("copied string is " + ss1);
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
          
    }

}