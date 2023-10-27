package Default_static_method;  //**this will give error so comment it out */



// 3)define interface "Fourth" with "default void disp3()" method.
// define a class "Base1" with "public void disp3()" method,
// now derive a class Sub1 from "Base1" and "Fourth". Sub1 class should have only "public void myfun()" method.
// inside main create an object of "Sub1" and invoke "disp3".
// once you get the result, also try to invoke "disp3" of "Fourth"

interface Fourth{
    default void disp3()
    {
        System.out.println("inside interface4 and inside the method disp3");
    }
}
class Base1
{
    public void disp3()
    {
        System.out.println("class Base1 and inside the method disp3");
    }
}
class Sub1 extends Base1 implements Fourth
{

    public void fun(){
    System.out.println("x");
    }
    public void disp3()
    {
        System.out.println("class Sub1 and inside the method disp3");
        Fourth.super.disp3(); // it used when we are calling non-static method(default method) of interface
                             //  from implementation class 
    // **** Fourth.disp();  // it used when we are calling static method of interface from implementation class
    }
}
public class Demo3 
{
    public static void main(String args[])
    {
        Sub1 obj =new Sub1();
        obj.disp3();
        Fourth test = new Sub1();
        test.disp3();
    }
}

// No enclosing instance of the type Fourth is accessible in scope