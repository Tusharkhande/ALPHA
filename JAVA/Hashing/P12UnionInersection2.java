import java.util.*;

public class P12UnionInersection2 {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int i=0; i<arr2.length;i++){
            set.add(arr2[i]);
        }

        System.out.print("Union: ");
        for(Integer s: set){
            System.out.print(s + " ");
        }
        System.out.println();

        set.clear();
        
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        System.out.print("IntersectionL: ");

        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                System.out.print(arr2[i] + " ");
                set.remove(arr2[i]);
            }
        }
    }
}
