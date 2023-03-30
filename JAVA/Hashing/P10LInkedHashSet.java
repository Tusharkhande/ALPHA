import java.util.HashSet;
import java.util.LinkedHashSet;

public class P10LInkedHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(4);
        hs.add(3);
        hs.add(2);
        hs.add(5);

        System.out.println("HashSet: " + hs);

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(5);
        lhs.add(3);
        lhs.add(4);

        System.out.println("LinkedHashSet: " + lhs);

        lhs.remove(4);
        System.out.println(lhs);
    }
}
