class First{
    private int num1;
    private int num2;


    First()
    {
        System.out.println("First");
    }

    void set_Values1(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    int get_num1()
    {
        return (this.num1);
    }
    int get_num2()
    {
        return (this.num2);
    }
    void member_fun_first()
    {
        System.out.println("member_fun_first");
    }

}
class Second {

    private int num3;
    private int num4;


    Second(){System.out.println("Second");}
    

    void set_Values2(int num3, int num4)
    {
        
        this.num3 = num3;
        this.num4 = num4;
    }
    int get_num1()
    {
        return (this.num3);
    }
    int get_num2()
    {
        return (this.num4);
    }
    void member_fun_Second()
    {
        System.out.println("member_fun_second");
    }
}
public class first_question{

       static First first = new First();
        static Second second = new Second();

    public static void main(String[] args)
    {
        

        // first_question two = new first_question();
        first.set_Values1(11,22);
        System.out.println(first.get_num1());
        System.out.println(first.get_num2());
        first.member_fun_first();
        second.set_Values2(55,88);
        System.out.println(second.get_num1());
        System.out.println(second.get_num2());
        second.member_fun_Second();
    }
}