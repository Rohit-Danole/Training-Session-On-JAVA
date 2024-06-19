package MultiThreading;

class MyThread5 extends Thread
{
    public void run()
    {
        Thread th = Thread.currentThread();
        th.setName("Rohit");
        String threadName = th.getName();

        for (int i = 0; i <= 10; i++)
        {
            System.out.print(i +" ");
            System.out.println(threadName);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadDemoUsingSleep_$
{
    public static void main(String[] args) {
        MyThread5 t1 = new MyThread5();
        Thread th = Thread.currentThread();
        String threadName = th.getName();

        t1.start();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i +" ");
            System.out.println(threadName);
        }
    }
}
