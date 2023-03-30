import java.util.*;

public class P1HashMap{
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("Tushar", 1);
        hm.put("Shivam", 2);
        hm.put("Vaibhav", 3);

        System.out.println(hm);

        System.out.println(hm.get("Tushar"));
        System.out.println(hm.get("Rugwed"));

        System.out.println(hm.containsKey("Vaibhav"));
        System.out.println(hm.containsKey("Rugwed"));

        System.out.println(hm.remove("Vaibhav"));
        System.out.println(hm.remove("Rugwed"));

        System.out.println(hm.isEmpty());
        System.out.println(hm.size());

        hm.clear();

        System.out.println(hm.isEmpty());
        System.out.println(hm.size());
    }    
}