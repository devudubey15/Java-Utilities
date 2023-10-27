//3)Define a class “Check” in which declare member variables using  different accessibility modifiers i.e.
//  <default>, private ,public and protected.   Define a function “disp”  which should be public.  
//  Define a class “CheckDemo” in which you will write “main()” function. Create an instance of  the class
//   “Check” and  show how many  variables can be accessed directly and how many indirectly.
class Check{
     int num1; // default member variable
    public int num2 ;
    protected int num3 ;
    private int num4;

    public void  disp()
    {
        System.out.println("num1"+num1);
        System.out.println("num2"+num2);
        System.out.println("num3"+num3);
        System.out.println("num4"+num4);
        System.out.println("display");
    }

}
public class CheckDemo
{
    public static void main(String [] args) 
    {
        Check test = new Check();
        test.num1 =89;
        test.num2 =99;
        test.num3 = 109;
        // test.num4 = 119; // not visible in this class 
        test.disp();
    }
}
//three variables can be accessed directly from check in checkDemo (default, public, protected)
