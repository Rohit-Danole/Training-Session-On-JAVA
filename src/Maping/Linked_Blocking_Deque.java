
package Maping;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Linked_Blocking_Deque {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Deque<Integer> dequeue = new LinkedBlockingDeque<>();

        dequeue.add(1);
        dequeue.add(2);
        dequeue.add(3);
        dequeue.add(4);
        dequeue.add(5);
        for(int element:dequeue)
        {
            System.out.println(element);
        }
        System.out.println("**********");
        dequeue.addFirst(0);

        System.out.println(dequeue.removeFirst());
    }

}
