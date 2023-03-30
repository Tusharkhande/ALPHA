import java.util.*;
public class P5CollectionsSort {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5); //O(1)
        list.add(1);
        list.add(9);
        list.add(8);
        list.add(2);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
