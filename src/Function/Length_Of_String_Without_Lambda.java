package Function;
interface Function
{
    public int apply(String str);
}
//class MyFunction implements Function
//{
//    public int apply(String str)
//    {
//        return str.length();
//    }
//}
//public class Length_Of_String_Without_Lambda
//{
//    public static void main(String args[])
//    {
//        Function mf = new MyFunction();
//        System.out.println(mf.apply("Rohit"));
//        System.out.println(mf.apply("Danole"));
//    }
//}
class Length_Of_String_With_Lambda
{
    public static void main(String args[])
    {
        Function mf = str -> str.length();
        System.out.println(mf.apply("Rohit"));
        System.out.println(mf.apply("Danole"));
    }
}