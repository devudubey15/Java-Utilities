// 2) Person class implements Serializable with
// 	private String name
// 	private int age

// 		getters and setters
// 		parameterized constructor

// Student extends Person
// 	private int rollno
// 		getter and setters
// 		parameterized constructor accepting name,age and rollno
// 			pass name and age to the super constructor

// Demo class with main
// 	create one object of Student, write it inside file and then read.

import java.io.*;
class Person implements Serializable
{
	private String name;
	private int age;

	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
        System.out.println("inside parameterised constructor of Person");
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
		System.out.println("getName called from Person");
		return name;
	}
	public int getAge() 
	{
		System.out.println("getAge called from Person");
		return age;
	}
    public String toString()
    {
        return "[ Person's name = " + name + ", and Person's age = " + age + "]";
    }
}
// Student extends Person
// 	private int rollno
// 		getter and setters
// 		parameterized constructor accepting name,age and rollno
// 			pass name and age to the super constructor

class Student extends Person implements Serializable
{
	private int rollno;

	public Student(int rollno, String name, int age)
	{
		super(name, age);
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
     public String toString()
    {
        return "[ student's rollno = " + rollno +",\t Student's name  = "+getName() +",\tStudent's Age"+getAge()+ "] " ;
    }
}
// Demo class with main
// 	create one object of Student, write it inside file and then read.


public class Demo{
	public static void main(String[] args)
	{
		Student student = new Student(021,"rahul",62);
		String path ="C://Users//Satyakam//OneDrive//Dev//OneDrive//Documents//c-dac//nitin_sir//java//Day_13//day13_ccode//Abc_13_2.txt";
		try
		{
			FileOutputStream out = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(student);
			System.out.println("Student: before read " + student);
			oos.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		try{
			FileInputStream out2 = new FileInputStream(path);
			ObjectInputStream oss2 = new ObjectInputStream(out2);
			Student stu = (Student)oss2.readObject();
			System.out.println("Student: after read " + stu);
			oss2.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
	}
}