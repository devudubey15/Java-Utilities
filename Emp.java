// 3) Define a class "Emp" with private static member "int cnt".
// How will u make sure that outsiders can read the value of cnt ?
class Third {

    private static int cnt ;

    public static void Set_cnt(int cnt) { // static member function
        
        Third.cnt = cnt;

    }
    public static int Get_cnt() { // static member function
        return cnt;
    }

    public  void Set_cnt1(int cnt) { // non-static member function
        
        Third.cnt = cnt;

    }
    public  int Get_cnt1() { // non-static member function
        return cnt;
    }
}
class Emp
{
    

    public static void main(String[] args)
    {
        
        
        Third th = new Third();
        th.Set_cnt1(999);
        System.out.println(th.Get_cnt1());


        Third.Set_cnt(78987); // these values are assingn to cnt after object creation  because in other 
                             // other class execution starts with main()
        System.out.println(Third.Get_cnt());
        
    }
}