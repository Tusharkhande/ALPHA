import java.util.HashSet;

public class P12UnionIntersection {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] ={6,3,9,2,9,4};
        HashSet<Integer> set = new HashSet<>();

        //union
        for(int i: arr1){
            set.add(i);
        }

        for(int i: arr2){
            set.add(i);
        }

        System.out.println("Union: "+ set.size());

        //intersection
        set.clear();
        int count = 0;
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }

        System.out.println("Intersection: "+count);

    }
}
