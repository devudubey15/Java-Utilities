// 1)create a customer class with following attributes
// 	custid
// 	custname
// 	address
// 	age
// create one instance of it and store it in a file. (Serialization).
// now open a file, read the object and read its contents . (Deserialization)

import java.io.*;
public class Customer implements Serializable{
	private int custid;
	private String custname;
	private String address;
	private int age;

	public Customer(int custid, String custname, String address, int age)
	{
		this.custid = custid;
		this.custname = custname;
		this.address = address;
		this.age = age;
	}
	@Override
	 public String toString()
	{
		return "Customer [custid=" + custid + ", custname="+ custname + ", address=" + address + ", age=" + age + "]";
	}

	public static void main(String[] args)
	{
		Customer customer = new Customer(4442,"John","america",34);
		String path = "C://Users//Satyakam//OneDrive//Dev//OneDrive//Documents//c-dac//nitin_sir//java//Day_13//day13_ccode//Abc_13_1.txt";
		try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(customer);// serialization
            System.out.println("Customer: before read " + customer);
            oos.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        try
        { 
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Customer cust= (Customer)ois.readObject();//deserialization
            System.out.println("Customer: after read " + cust);
            ois.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        catch(ClassNotFoundException ce)
        {
            ce.printStackTrace();
        }
		


	}

}

