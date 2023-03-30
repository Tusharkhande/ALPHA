import java.util.HashSet;

public class P8HashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(5);
        set.add(2);
        set.add(4);

        System.out.println(set);

        System.out.println(set.contains(4));
        System.out.println(set.contains(3));

        System.out.println(set.isEmpty());

        set.clear();

        System.out.println(set.size());


    }
}
