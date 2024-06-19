package Predicate;
interface Predicate
{
    public boolean test(int i);
}
//class MyPredicate implements Predicate
//{
//    public boolean test(int i)
//    {
//        if (i < 10)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//    }
//}
//public class Number_Less_Than_10
//{
//    public static void main(String[] args)
//    {
//        Predicate p = new MyPredicate();
//        System.out.println(p.test(15));
//        System.out.println(p.test(8));
//    }
//}



class Number_Less_Than_10
{
    public static void main(String args[])
    {
        Predicate p = i -> (i<10);
        System.out.println(p.test(1));
        System.out.println(p.test(20));
    }
}