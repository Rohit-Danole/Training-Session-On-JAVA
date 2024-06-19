package Iteration_Using_Lambda;
import java.util.ArrayList;
import java.util.List;
public class Iterating_Item
{
    public static void main(String args[])
    {
        List<String> list = new ArrayList<String>();
        list.add("Virat");
        list.add("Alex");
        list.add("Jai");
        list.add("Jatin");
        list.add("Rohit");
        list.forEach((element)->
        {
            System.out.println(element);
        });

    }
}
