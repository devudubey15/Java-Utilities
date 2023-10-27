// 2)Create a class with static and non-static member variables. Define static and non-static member functions. 
// Create instance of this class and call both static and non-static member functions.
class Second{
    private static int num1;
    private int num2;

    public static void set_num1(int num1)
    {
        Second.num1 = num1;
    }
    static int get_num1()
    {
        return num1;
    }
    public void set_num2(int num2)
    {
        this.num2 = num2;
    }
    int get_num2()
    {
        return num2;
    }
    
}
class Demo_second 
{
    
    public static void main(String[] args)
    {
        Second second = new Second();
        Second.set_num1(555);
        System.out.println(Second.get_num1());
        
        second.set_num2(59999955);
        System.out.println(second.get_num2());
    
    }
}