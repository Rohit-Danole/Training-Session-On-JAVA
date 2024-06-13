package Method_Overiding;

public class B extends A
{
    int c;
    B(int m , int n, int o)
    {
        super(m, n);
        c=o;
    }
    void display()
    {
        super.display();
        System.out.println("C from B Class " +c);
    }
}
