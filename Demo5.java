package Default_static_method;  //**this will give error so comment it out */

// 5) define interface "First" with "static void disp1()" method.
// class "Base" with "static void disp2()" method.
// derive a class "Sub" from "Base" and "First"
// now define a class Demo in which define "main" method.
// inside main show how many ways you can invoke "disp1" and "disp2" methods.

interface First{
    static void disp1()
    {
        System.out.println("inside disp of First interface");
    }
}
class Base 
{
    static void disp2()
    {
        System.out.println("inside disp of Base class");
    }
}

class Sub extends Base implements First
{
    
}
public class Demo5
{
    public static void main(String arg[])
    {
        

        Base.disp2();
        First.disp1();

    }
} 