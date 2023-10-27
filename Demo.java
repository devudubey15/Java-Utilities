// 3) define "MyException" as a checked exception.

// define a class "Demo" with 
// 	public void show1(), public void show2() , public void show3() and main functions.

// inside "show3()" accept a number and if it is greater than 10 raise "MyException" else display the number.
// 	[ this method shouldn't handle the exception]

// main() function should call "show1()" , 
// show1() function should call "show2()",
// show2() function should call "show3()"

// show2() should not handle the exception but show1() should handle.

import java.util.Scanner;

class MyException extends Exception
{
	public MyException(String mess)
	{
		super(mess);
	}
}
public class Demo 
{
    // Demo()
    // {}
	public void show1()
	{
		try
		{
			show2();
		}
		catch (MyException e)
		{
			System.out.println(e);
           
		}
		
	}
	public void show2()throws MyException
	{
		show3();
	}
	public void show3()throws MyException
	{
        System.out.println("Enter some values");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Entered the value is : " + num);
        sc.close();
		if(num>10)
		{
			throw new MyException("Greater value exception");
		}
		else 
		{
			System.out.println("the number is " + num);
		}
        
	}

	public static void main(String args[])
	{
        Demo d = new Demo();
		d.show1();

	}
}