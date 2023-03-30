import java.util.PriorityQueue;

public class P7NearbyCars {
     static class Points implements Comparable<Points>{
        int x;
        int y;
        int distSq;
        int idx;

        public Points(int x, int y, int distSq, int idx){
            this.x= x;
            this.y= y;
            this.distSq = distSq;
            this.idx = idx;
        }

         public int compareTo(Points p2){
            return this.distSq - p2.distSq;
         }

     }

     public static void main(String[] args) {
        int pts[][] = { {3,3},{5,-1},{-2,4}};
        int k = 2;
        PriorityQueue<Points> pq = new PriorityQueue<>();

        for(int i=0;i<pts.length;i++){
            int distSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Points(pts[i][0], pts[i][1], distSq, i));
        }

        for(int i=0; i<k; i++){
            System.out.println("C"+pq.remove().idx);
        }
     }
}
