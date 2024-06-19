package Student_Record;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Student_Records
{
    public static void main(String args[])
    {
        Map<Integer, Student> students = new HashMap<Integer, Student>();

        students.put(1, new Student(1, "James", "Smith"));
        students.put(2, new Student(2, "Ram", "Patil"));
        students.put(3, new Student(3, "Sam", "Joshi"));
        students.put(4, new Student(4, "John", "Doe"));
        students.put(5, new Student(5, "Jack", "Smith"));

        Iterator <Map.Entry<Integer, Student>> entry = students.entrySet().iterator();
        while (entry.hasNext())
        {
            Entry<Integer, Student> temp = entry.next();
            System.out.println("key "+temp.getKey() +" value " +temp.getValue());
        }
    }
}
