// 5) accept as many as numbers from user till he presses "0"  and write these numbers in a file. 
// Now Open a file and read these numbers. ( Hint :- use Scanner class for input, FileOutputStream,
//  DataOutputStream, FileInputStream , DataInputStream)


// FileInputStream fis=new FileInputStream("d:\\abc.txt");
// DataInputStream dis=new DataInputStream(fis);

// while(dis.available()!=0)
// {
// 	S.o.p(dis.readInt());
// }
import java.io.*;
import java.util.*;

public class MyClass5
{
	public static void main(String[] args) 
	{
		int number;
		String path= "C://Users//Satyakam//OneDrive//Dev//OneDrive//Documents//c-dac//nitin_sir//java//Day_12//File_Handling_1//Day_12_code//Abc5.txt";
		Scanner sc = new Scanner(System.in);
		try
		{
			FileOutputStream Fos = new FileOutputStream(path);
			DataOutputStream dos = new DataOutputStream(Fos);
			System.out.println("enter the numbers");
			while(true)
			{
				number = sc.nextInt();
                dos.writeInt(number);
				if(number ==0)
				{
					break;
				}
                
			}
			
            sc.close();
            dos.close();

		}
		catch(IOException	e)
		{
			e.printStackTrace();
		}
		try{
			FileInputStream fis = new FileInputStream(path);
			DataInputStream dis = new DataInputStream(fis);

			// byte arr[] = new byte[(int)new File(path).length()];

			// do
            // {
                
            //      System.out.println(dis.readInt());
			// }
            // while(dis.readInt() != '\n');
			// System.out.println("arr: " + arr);
            // dis.close();
            while (true) {
                int readNumber;
                try {
                    readNumber = dis.readInt();
                    System.out.println(readNumber);
                } 
                catch (EOFException e)
                {
                    break;
                }
            }
            dis.close();
        } 
        catch(IOException	e)
		{
			e.printStackTrace();
		}

	}
}
