package MultiThreading;

class ThreadRunnable implements Runnable
{
    public void run()
    {
        for (int i = 0; i <= 10; i++)
        {
            System.out.println(i);
        }
    }
}
public class Using_Runnable_Interface
{
    public static void main(String args[])
    {
        ThreadRunnable t1 = new ThreadRunnable();
        Thread t = new Thread(t1);
        t.start();
    }
}
