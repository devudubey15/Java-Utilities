//  Revision_1) 

//  Define a class “MyClass”. Define a class “Everything” and define a member function 
// with variable no. of argument inside it. Define  a class Demo1  and define main function in it. 
// From main function , call the function of class Everything and make sure you can pass any arguments 
// , it will take and display. It should even take instance of “MyClass” and display. 

class MyClass
{
    private int myNumber;
    private String myString;

    public MyClass(int myNumber, String myString)
    {
        this.myNumber = myNumber;
        this.myString = myString;
    }
    void getItems()
    {
        System.out.println("Mynumber "+myNumber+" mystring "+myString);
    }
    int getNumber()
    {
        return this.myNumber;
    }
    String getString()
    {
        return this.myString;
    }
}
class Everything 
{
    private int NumberEvery;
    private String StringEvery;

    MyClass ref =null;

    void fun1(Object ...obj)
    {
            for(int i =0; i<obj.length; i++)
            {
                if ((obj[i]) instanceof Integer)
                {
                    this.NumberEvery = (int) obj[i]; 
                    System.out.println(" NumberEvery "+this.NumberEvery);
                }
                if ((obj[i]) instanceof String)
                {
                    this.StringEvery = (obj[i]).toString();
                    System.out.println(" StringEvery "+this.StringEvery);
                }
                if ((obj[i]) instanceof MyClass)
                {
                    ref = ((MyClass) obj[i]);
                }
            }   
    }
    MyClass getMyClass()
    {
        return ref;
    }

}
class Demo1
{
    public static void main (String args[]){

        Everything everything = new Everything();
         everything.fun1(678,"hello",new MyClass(89,"devu"));
        System.out.println(everything.getMyClass().getNumber());
        System.out.println(everything.getMyClass().getString());


    }
}