// 5)Show the example of multi-level inheritance with constructor invocation.

class Base
{
    private int Num1;
    private int Num2;
    Base()
    {
        System.out.println("Base constructor");
    }
    Base(int Num1)
    {
        this.Num1 = Num1;
        System.out.println("in single parametrised constructor"+Num1);
    }
    Base(int Num1, int Num2)
    {
        this.Num1 = Num1;
        this.Num2 = Num2;
        System.out.println("in Double parametrised constructor"+Num1+ Num2);
    }

}
class Derived1 extends Base{
    private int num3;
    private int num4;

    Derived1()
    {
        super();
        System.out.println("inside the constructr of derived1 and callling base constructor with super()");

    }
    Derived1(int num3)
    {
        super(num3);
        this.num3 = num3;
        System.out.println("inside the constructor (single parameterised) of Derived1");
    }
    Derived1(int num3, int num4)
    {
        super(num3, num4);
        this.num3 = num3;
        this.num4=num4;
        System.out.println("inside the constructor (Double parameterised) of Derived1");
    }
}
class Derived2 extends Base{
    private int num5,num6;

    Derived2()
    {
        super();
        System.out.println("inside the Derived2 constructor");
    }
    Derived2(int num5)
    {
        super(num5);
        this.num5 = num5;
        System.out.println("inside the Derived2 constructor (single parameterised )");
    }
    Derived2(int num5,int num6)
    {
        // Super();
        this.num5 = num5;
        this.num6 = num6;
        System.out.println("inside the Derived2 constructor (default)");
    }

}
public class Demo5
{
    public static void main(String[] args)
    {
        Derived1 derived1 = new Derived1();
        Derived1 derived1_2 = new Derived1(25);
        Derived1 derived1_3 = new Derived1(56,78);
        Derived2 derived2 = new Derived2();
        Derived2 derived2_2 = new Derived2(88);
        Derived2 derived2_3 = new Derived2(98,97);

    }
}