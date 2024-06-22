package Maping;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Linked_Hash_Set {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Set<Integer> s1 = new HashSet<>();
        //Set<Integer> s1 = new TreeSet<>();
        Set<Integer> s1 = new LinkedHashSet<>();
		/*s1.add("abc");
		s1.add("xyz");
		s1.add("abc");
		System.out.println(s1);
		System.out.println(s1.contains("xyz"));*/
        for(int i=30;i>0;i--)
        {
            s1.add(i);
        }
        for(int i:s1)
        {
            System.out.println(i);
        }


    }

}
