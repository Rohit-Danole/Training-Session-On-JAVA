//package Lambda;
//interface My
//{
//    void myInterMethod();
//}
//public class Test_1 {
//    public static void main(String args[]) {
//        My person = new My()
//        {
//            public void myInterMethod()
//            {
//                System.out.println("mozo");
//            }
//        } ;
//        person.myInterMethod();
//    }
//}

//By using Lambda Function

//package Lambda;
//interface My
//{
//    void myInterMethod();
//}
//public class Test_1 {
//    public static void main(String args[]) {
//        My person = () ->
//        {
//            System.out.println("mozo");
//        };
//        person.myInterMethod();
//    }
//}

//Two Interfaces

package Lambda;
interface My
{
    void myInterMethod();
}
interface SingleParam
{
    public String singleArgument(String name);
}
public class Test_1 {
    public static void main(String args[]) {
        SingleParam person = (name) ->
        {
            return "Hello " +name;
        };
        System.out.println(person.singleArgument("Rohit"));
        My m = () ->
        {
            System.out.println("mozo");
        };
        m.myInterMethod();
        Add a1 = (a,b) ->{return a+b;};
        System.out.println(a1.add(1,2));
    }
}


