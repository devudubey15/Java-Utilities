// 3) Define a class "Student" with
// 	private int rollno and private String name and private int age;
// 	setters and getters

// 	create 2 objects of Student and write them inside filesystem and thereafter read both the objects and display.

import java.io.*;

public class Student1 implements Serializable
{
	private int rollno;
	private String name;
	private int age;

	public Student1(int rollno, String name, int age)
	{
		this.name = name;
		this.age = age;	
		this.rollno = rollno;
		System.out.println("inside parameterised constructor of Student");
	}
	void setRollno(int rollno)
	{
		this.rollno = rollno;
		System.out.println("adding rollno by setter");
	}
	int getRollno()
	{
		System.out.println("inside getter of Student");
		return this.rollno;
	}
	public void setName(String name)
	{
		this.name = name;
		System.out.println("name added by setter  = " + name);
	}
	public void setAge(int age)
	{
		this.age = age;
		System.out.println("age added by setter = " + age);
	}
	public String getName()
	{
		System.out.println("getName called from Student");
		return name;
	}
	public int getAge() 
	{
		System.out.println("getAge called from Student");
		return age;
	}
  
     public String toString()
    {
        return "[ student's rollno = " + getRollno() +",\t Student's name  = "+getName() +",\tStudent's Age"+getAge()+ "] " ;
    }
	public static void main(String[] args)
	{
		Student1 student1 = new Student1(234,"Alok",24);
		Student1 student2 = new Student1(345,"Prasant",26);
		String path = "C://Users//Satyakam//OneDrive//Dev//OneDrive//Documents//c-dac//nitin_sir//java//Day_13//day13_ccode//Abc_13_3.txt";
		try{
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(student1);
			oos.writeObject(student2);
			System.out.println("object written in file");
			oos.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		try{
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			// Student1 s = (Student1)ois.readObject();
			// System.out.println(s);
			
		    try{
				while(true)
				{
					Student1 s = (Student1)ois.readObject();
					System.out.println(s);
				}
			}
			catch(EOFException e){
				System.out.println("all objects are diplayed");
			}
			ois.close();
		}
		catch(IOException  | ClassCastException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}