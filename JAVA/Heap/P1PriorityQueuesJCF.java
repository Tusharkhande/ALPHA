import java.util.PriorityQueue;

public class P1PriorityQueuesJCF{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(7);
        pq.add(1);
        pq.add(4);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}