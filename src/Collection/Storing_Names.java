package Collection;
import java.util.Set;
import java.util.TreeSet;
public class Storing_Names
{
    public static void main(String[] args)
    {
        //TreeSet stores in ascending order
        Set<String> names = new TreeSet<String>();
        names.add("vijay");
        names.add("sanjay");
        names.add("manjay");
        names.add("tajay");

        System.out.println("Sorted Names");
        for (String name : names)
        {
            System.out.println(name);
        }
    }
}










