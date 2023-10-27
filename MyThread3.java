// 3) create 3 threads in such a way that while one thread is executing, 2 threads cannot interfere.
//  they should display output "Exec  0" to "Exec 5".

 public class MyThread3 implements Runnable 
 {
    synchronized public void run()
    {
        for(int i = 0; i <6;i++)
        {
            System.out.println("Exec " + i );
        }
    }

    public static void main(String[] args)
    {
        MyThread3 myThread = new MyThread3();

        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);
        Thread t3 = new Thread(myThread);
        t1.start();
        t2.start();
        t3.start();

    }
 }