package MultiThreading;
class Table
{
    public void display(int n)
    {
        synchronized(this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n * i);
            }
        }
    }
}
class Thread1 extends Thread
{
    Table t;
    Thread1(Table t)
    {
        this.t = t;
    }
    public void run()
    {
        t.display(5);
    }
}
class Thread2 extends Thread
{
    Table t;
    Thread2(Table t)
    {
        this.t = t;
    }
    public void run()
    {
        t.display(6);
    }

}
public class MutualExclusion
{
    public static void main(String args[])
    {
        Table table = new Table();
        Thread th1 = new Thread1(table);
        Thread th2 = new Thread2(table);
        th1.start();
        th2.start();
    }
}
