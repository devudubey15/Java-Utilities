package Default_static_method;  //**this will give error so comment it out */

// 2) define interface "Third" with "default void disp1()" and "static void disp2()" methods.
// derive a class "Sub" from "Third" ( do not override "disp1")
// inside main function invoke "disp1" and "disp2" methods.

interface Third{
    default void disp1()
    {
        System.out.println("interface third and method disp1");
    }
    default void disp2()
    {
        System.out.println("interface third and method disp2");
    }
}
class Sub implements Third
{
    public void disp2()
    {
        System.out.println("class sub and method disp2");
    }
}

public class Demo2
{
    public static void main(String[] args)
    {
        Sub refsub = new  Sub();
        refsub.disp1();
        refsub.disp2();
    }
}