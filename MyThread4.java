// 4)create 2 threads. Write a program which displays number 1 to 10 using class lock. 
// [hint:- use "implements Runnable" and synchronized block]
public class MyThread4 implements Runnable
{
     public void run()
    {   
        synchronized(MyThread4.class){
            
            for(int i= 1;i<=10;i++)
            {
                System.out.println("Thread :" +i);
            }
        }
    }
    public static void main(String args[])
    {
        MyThread4 m1 = new MyThread4();
        MyThread4 m2 = new MyThread4();
        Thread th1 = new Thread(m1);
        Thread th2 = new Thread(m2);
        th1.start();
        th2.start();
    }
}
