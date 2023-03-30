import java.util.ArrayList;

public class P1ArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,9);  //O(n)

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }

        System.out.println(list);

        System.out.println(list.get(2));    //O(n)

        list.remove(1);
        System.out.println(list);

        list.set(1, 3);
        System.out.println(list);

        System.out.println(list.contains(3));
        System.out.println(list.contains(11));
    }
}