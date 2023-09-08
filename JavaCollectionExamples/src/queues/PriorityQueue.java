package queues;

import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {

        Queue<String> pq = new java.util.PriorityQueue<>();
        String s= "hhh";
        pq.add(s);
        pq.add("bbb");
        pq.add("ccc");
        pq.add("ddd");
        pq.add("aaa");
        pq.add("ggg");
        System.out.println("priorityqueue size is : "+pq.size());
        System.out.println("priorityqueue contains : "+pq);
        pq.poll();
        pq.poll();
        pq.remove(s);
        System.out.println("priorityqueue size is : "+pq.size());
        System.out.println("priorityqueue contains : "+pq);



    }
}
