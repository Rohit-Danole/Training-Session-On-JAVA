package Maping;

import java.util.*;

class ArrayList1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> list = new ArrayList<Integer>();
		/*List ls = new ArrayList();
		ls.add("abc");
		ls.add(12);
		ls.add(true);*/

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("List is:");
        System.out.println(list);
        List newlist = new ArrayList<>();
        newlist.add(10);
        newlist.add(20);
        newlist.add(30);
        newlist.add("Abc");
        list.addAll(newlist);

        System.out.println(list);
        System.out.println(list.get(5));
        list.remove(2);

        System.out.println(list);


    }

}
