import java.util.Stack;

public class P5QUsing2Stacks2 {
    static class Queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){   //O(1)
            s1.push(data);
        }

        
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }

            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            
            int front = s2.pop();

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }

            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }

            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int front = s2.peek();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return front;
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

