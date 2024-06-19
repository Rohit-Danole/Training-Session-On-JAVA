package Lambda;
interface I
{
    static void m1()
    {
        System.out.println("m1 - A");
    }
    static void m2()
    {
        System.out.println("m2 - B");
    }
}
class A implements I
{

}
public class Test
{
    public static void main(String args[])
    {
        I.m1();
        I.m2();
        //A.m1();   Error
        //A.m2();   Error
        //I i = new A();
        //i.m1();   Error
        //i.m2();   Error
        //A a = new A();
        //a.m1();   Error
        //a.m2();   Error
    }
}
