import java.lang.Thread;
public class Mythread2 implements Runnable 
{
    public void run()
    {
        for(int i = (int)'A'; i <= (int)'J'; i++)
        {
            System.out.print((char)i);
        }
    }
     public static void main(String[] args)
     {
        Mythread2 ob = new Mythread2();
        

        Thread t1 = new Thread(ob);
        Thread t2 = new Thread(ob);

        t1.start();
        t2.start();
     }
}