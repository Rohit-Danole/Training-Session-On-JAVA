package Iteration_Using_Lambda;

public class Lambda_With_Thread
{
    public static void main(String[] args)
    {
        //Using Old Method
        Runnable r = new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("This is thread with lambda expression");
            }
        };
        Thread thread = new Thread(r);
        thread.start();

        //Using Lambda Approach
        Runnable t1 = ()->
        {
            System.out.println("This is thread with lambda creating thread 2");
        };
        Thread thread1 = new Thread(t1);
        thread1.start();
    }
}
