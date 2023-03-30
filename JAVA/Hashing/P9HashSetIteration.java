import java.util.*;

public class P9HashSetIteration {
    public static void main(String[] args) {
        HashSet<String> nameSet = new HashSet<>();

        nameSet.add("Tushar");
        nameSet.add("Kaustubh");
        nameSet.add("Shivam");
        nameSet.add("Nirav");
        nameSet.add("Om");

        System.out.println(nameSet);
        System.out.println();

        System.out.println("Using Iterator");

        Iterator itr = nameSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();


        System.out.println("Using enhanced for");
        for(String name: nameSet){
            System.out.println(name);
        }

    }
}
