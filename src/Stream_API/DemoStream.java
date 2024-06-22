package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(14);
        arrayList.add(4);
        arrayList.add(20);
        System.out.println("Collection Element "+arrayList);
        System.out.println("--------------------");
        List<Integer> evenNumbers = arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("List Of Even Numbers " +evenNumbers);
        System.out.println("--------------------");
    }
}
