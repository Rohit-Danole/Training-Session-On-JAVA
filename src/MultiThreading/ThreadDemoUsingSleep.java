package MultiThreading;

class MyThread3 extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 10; i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(500);
            }
            catch (Exception e)
            {
                System.out.println(e);
                e.printStackTrace();
            }

        }
    }
}
public class ThreadDemoUsingSleep
{
    public static void main(String args[])
    {
        MyThread3 t1 = new MyThread3();
        t1.start();
    }
}
