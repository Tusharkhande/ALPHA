import java.util.*;


public class P2HashMapIteration {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Tushar",100);
        hm.put("Shivam",98);
        hm.put("Vaibhav",63);
        hm.put("Kaustubh",92);
        hm.put("Sagar",150);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("Key: " + k + ", Value: " + hm.get(k));
        }


    }
}
