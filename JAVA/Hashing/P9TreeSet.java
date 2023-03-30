import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class P9TreeSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Tushar");
        hs.add("Kaustubh");
        hs.add("Shivam");
        hs.add("Nirav");
        hs.add("Om");

        System.out.println(hs);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Tushar");
        lhs.add("Kaustubh");
        lhs.add("Shivam");
        lhs.add("Nirav");
        lhs.add("Om");

        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Tushar");
        ts.add("Kaustubh");
        ts.add("Shivam");
        ts.add("Nirav");
        ts.add("Om");

        System.out.println(ts);

    }
}