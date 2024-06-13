package Superclass_Reference_Variable;
//
//class A1
//{
//
//}
//class A2 extends A1
//{
//
//}
//class A3
//{
//    public static void main(String args[])
//    {
//        A1 x;
//        A2 z = new A2();
//        x = new A2();
//        z = new A1();
//    }
//}
class A1
{
    void m1()
    {
        System.out.println("A1");
    }
}
class A3 extends A1
{
    int m1(int m)
    {
        super.m1();
        return 100;
    }
    public static void main(String args[])
    {
        A3 obj = new A3();
        obj.m1();
    }
}
