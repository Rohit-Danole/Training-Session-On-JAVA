package MultiThreading;

class MyThread extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 10; i++)
        {
            System.out.println(i +" " + Thread.currentThread().getName());
        }
    }
}
public class ThreadDemoUsingJoin
{
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        t.join();//current executing thread will in sleep
        for (int i = 0; i <= 10; i++)
        {
            System.out.println(i +" " + Thread.currentThread().getName());
        }
    }
}
