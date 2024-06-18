package Abstract_Class;
abstract class ATM
{
abstract void withdraw();
abstract void gatBalance();
public void display()
{
    System.out.println("Displaying ATM");
}
}
class Abstract_Demo1 extends ATM
{

    @Override
    void withdraw()
    {
        System.out.println("Withdraw Method");
    }

    @Override
    void gatBalance()
    {
        System.out.println("Gat Balance Method");
    }
}
public class Abstract_Demo
{
    public static void main(String args[])
    {
        Abstract_Demo1 obj = new Abstract_Demo1();
        obj.withdraw();
        obj.gatBalance();
        obj.display();
    }

}
