package Default_static_method; //**this will give error so comment it out */

// package Default_static_method;
// 1) define interface "First" with "default void fun()" and interface "Second" with "default void fun()". 
// Now derive a class Child from both these interfaces. 
// Inside main function instantiate Child class instance and invoke "fun" method.

interface First{
    default void fun()
    {
        System.out.println("inside the default function of interface First");
    }
}
interface Second{
    default void fun()
    {
        System.out.println("inside the default function of interface Second");
    }
}
class Child implements First, Second
{
    public void fun()
    {
        System.out.println("inside the default function of interface Child");
    }
}
public class Demo1 {
    public static void main(String args[])
    {
        Child child = new Child();
        child.fun(); 
    }
}
