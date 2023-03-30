import java.util.TreeMap;

public class P5TreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("Tushar", 1);
        tm.put("Shivam", 2);
        tm.put("Vaibhav", 3);
        tm.put("Kaustubh", 3);

        System.out.println(tm);
    }
}
