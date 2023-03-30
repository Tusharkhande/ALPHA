import java.util.Stack;

public class P5ReverseString {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        // String res=new String("");
        // while(!s.isEmpty()){
        //     char curr=s.pop();
        //     res+=curr;
        // }
        // return res;

        StringBuilder res=new StringBuilder("");
        while(!s.empty()){
            char curr=s.pop();
            res.append(curr);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String str="abc";
        System.out.println(reverseString(str));
    }

    // public static void main(String args[]){
    //     Stack<Character> s=new Stack<>();
    //     s.push('a');
    //     s.push('b');
    //     s.push('c');

        
    //     while(!s.isEmpty()){
    //         System.out.println(s.peek());
    //         s.pop();
    //     }
    // }
}
