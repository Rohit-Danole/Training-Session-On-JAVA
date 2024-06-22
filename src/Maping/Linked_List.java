package Maping;

import java.util.LinkedList;
import java.util.Queue;

public class Linked_List {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(10);
        queue.offer(100);
        System.out.println("Queue is"+queue);
        queue.poll();
        System.out.println(" New Queue is"+queue);
        System.out.println(" peak operation is"+queue.peek());
    }

}
