package Exception_Handling;

class MyException extends Exception
{
    public MyException(String s) {
        super(s);
    }
}
public class User_Defined_Exception
{
    public static void main(String args[])
    {
        try {
            throw new MyException("My Exception");
        }
        catch(MyException e)
        {
            System.out.println("Caught Exception");
            System.out.println(e.getMessage());
        }
    }
}
