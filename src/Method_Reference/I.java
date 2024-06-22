package Method_Reference;

interface I
{
    public void M1();
}
class ABC
{
    public void M2()
    {
        System.out.println("ABC");
    }
    static void M3()
    {
        System.out.println("ABC");
    }
}
class Demo
{
    public static void main(String args[])
    {
        ABC obj = new ABC();

    }
}
