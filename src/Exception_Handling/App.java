package Exception_Handling;

public class App
{
    public static void main(String args[])
    {
        App app = new App();
        app.case2(10,0);
    }
    public void case1(int a,int b)
    {
        if (b!=0)
        {
            System.out.println(a/b);
        }
        else
        {
            System.out.println("The Value Of Y is 0");
        }
    }
    public void case2(int x,int y)
    {
        try
        {
            System.out.println(x/y);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
