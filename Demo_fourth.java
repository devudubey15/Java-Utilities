// 4)Show the example of single level inheritance with constructor invocation.
class Base{

    private int num1 ,num2;

    Base()
    {
        System.out.println("Base constructor");
    }
    Base(int num1)
    {
        
        this.num1 = num1;
        System.out.println(" for Base(int num1) , int num1:-"+num1);
    }

    Base(int num1, int num2)
    {
        System.out.println("trying to find out how it is working...");
        System.out.println(" for Base(int num1) , int num1:-"+num1+" , int num2:-"+num2);

    }
    void disp()
    {
        System.out.println("inside function of base");
    }


}
class Derived extends Base{

       Derived()
        {
            super(67);
            System.out.println("calling base constructor from this constructor");
        }
        Derived(int num1)
        {
            super(num1);
            System.out.println("inside the parameterised constructor of Derived and calling parameterised constructor of base");
        }
       Derived(int num1, int num2)
        {
            super(num1);
            System.out.println("there is some rule for more than one parameter in constructor");
            System.out.println("But calling from here");
        }

}
public class Demo_fourth{
    public static void main(String []args)
    {
        Derived derived1 = new Derived();
        Derived derived2 = new Derived(34);
        Derived derived3 = new Derived(45,56);
        derived1.disp();
        derived2.disp();
        derived3.disp();
    }
}




//from sub class constructor (default or parameterised) we can invoke default or
//  any parameterised constructor.