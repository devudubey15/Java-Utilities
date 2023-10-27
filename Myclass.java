class Second 
{
    private int num1;
    private int num2;
    Second ()
    {
        System.out.println("Myclass is instantiated without any arguments");
    }
    Second (int num1)
    {
        this.num1 = num1;
        System.out.println("Myclass is instantiated with one argument");
    }
    Second (int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("Myclass is instantiated with two arguments");
    }
    int getNum1()
    {
        return this.num1;
    }
    int getNum2()
    {
        return this.num2;
    }
    
}
public class Myclass{

    public static void main(String[] args)
    {
        Second m1 = new Second ();
        System.out.println(m1.getNum1());
        System.out.println(m1.getNum2());
        Second  m2 = new Second (34);
        System.out.println(m2.getNum1());
        System.out.println(m2.getNum2());
        Second  m3 = new Second (56,67);
        System.out.println(m3.getNum1());
        System.out.println(m3.getNum2());
    }

}