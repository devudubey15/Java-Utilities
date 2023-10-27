// 1) create a multi-threaded application by using  "extends Thread " method.
// create 2 threads. they should display characters from A to J.
import java.lang.Thread;
public class MyThread extends Thread
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
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Thread t1 = new Thread(ob);
        // Thread t2 = new Thread(ob);

        t1.start();
        t2.start();
     }
}