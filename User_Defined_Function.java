public class User_Defined_Function
{
    public static void main(String args[])
    {
        System.out.println("Hello World");
        User_Defined_Function obj = new User_Defined_Function();
        add();
        obj.sub();
        int ans = obj.div();

    }
    public static void add() //Static Function
    {
        int a = 2;
        int b = 3;
        int result = a + b;
        System.out.println(result);
    }
    public void sub() //Non Static Function
    {
        int a = 2;
        int b = 1;
        int result = a - b;
        System.out.println(result);
    }
    public int div()
    {
        int a = 2;
        int b = 1;
        int result = a / b;
        System.out.println(result);
        return result;
    }


}
