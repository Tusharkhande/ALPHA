import java.util.*;

public class P4LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("Tushar", 1);
        lhm.put("Shivam", 2);
        lhm.put("Vaibhav", 3);

        System.out.println(lhm);
    }
}
