package Exception_Handling;

public class Try_Catch_Finaly_Throw_Keyword
{
    public static void main(String args[])
    {
        int i=10,j=2,k=0;
        try{
            k=i*j;
            if(k<90)
            {
                throw new ArithmeticException();
            }
            System.out.println(k);
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Hello");
        }

    }
}
