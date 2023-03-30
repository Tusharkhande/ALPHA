import java.util.LinkedList;

public class P8LinkedList_JCF {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();

        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(2);
        ll.addFirst(1);

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
