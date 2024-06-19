package MultiThreading;

class MyThread11 extends Thread
{
    public void run()
    {
        try
        {
            this.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        for (int i=0;i<=10;i++)
        {
            System.out.println(i +" " + Thread.currentThread().getName());
        }
    }
}
public class Thread_Deadlock
{
    public static void main(String[] args)
    {
        MyThread11 t1 = new MyThread11();
        t1.start();
        for (int i=0;i<=10;i++)
        {
            System.out.println(i +" " + Thread.currentThread().getName());
        }
    }
}
