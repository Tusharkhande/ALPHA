import java.util.HashSet;

public class P11CountDistinctElms {
    public static void main(String[] args) {
        int arr[] = {4,3,5,2,8,9,4,1,6,8,2};

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }

        System.out.println(hs);

        System.out.println("Distinct elements: " + hs.size());
    }
}
