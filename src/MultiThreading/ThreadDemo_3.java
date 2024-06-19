package MultiThreading;

class MyThread2 extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 10; i++)
        {
            System.out.println(i);
        }
    }
}
public class ThreadDemo_3
{
    public static void main(String args[])
    {
        MyThread2 th1 = new MyThread2();
        MyThread2 th2 = new MyThread2();
        th1.start();
        th2.start();

    }
}
