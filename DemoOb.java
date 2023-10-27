//Define a class "DemoOb". 
//create an instance of it.
//now create a reference and assign the reference created in the above statement.
//	Discuss what happens?
//Now since u have 2 references, take one of the reference and assign a new instance of the class.
//	Discuss what happens?
//(For ur discussion, write necessary comments in the program)

class DemoOb
{
	private int num1;

	void setNum1(int num){this.num1 = num;}

	int getNum1() { return num1; }
	
	public static void main(String[] args)
	{
		DemoOb dObj1 = new DemoOb();
		dObj1.setNum1(56);
		System.out.println("Calling with first refernce"+dObj1.getNum1());

		DemoOb dObj2 = dObj1; // here both references pointing to same object
		System.out.println("Calling with second refernce"+dObj2.getNum1());
		dObj2.setNum1(100);
		System.out.println("Second time Calling with second refernce"+dObj2.getNum1());


		dObj2 = new DemoOb();// now dObj2 pointing to new object
		System.out.println("Calling with second refernce"+dObj2.getNum1());
		dObj2.setNum1(199);
		System.out.println("Second time Calling with second refernce"+dObj2.getNum1());

	}
}
// Output:-
            // Calling with first refernce56
            // Calling with second refernce56
            // Second time Calling with second refernce100
            // Calling with second refernce0
            // Second time Calling with second refernce199