import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Stack;

public class SAL {

    // static class Stack{
    //     static ArrayList<Integer> list=new ArrayList<>();

    //     public static boolean isEmpty(){
    //         if(list.size()==0){
    //             return true;
    //         }
    //         return false;
    //     }

    //     public static void push(int data){
    //         list.add(data);
    //     }

    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top=list.get(list.size()-1);
    //         list.remove(list.get(list.size()-1));
    //         return top;
    //     }

    //     public static int peek(){
    //         return list.get(list.size()-1);
    //     }
    // }

    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data=data;
    //         this.next=null;
    //     }
    // }

    // static Node head;
    // static Node tail;

    // static class  Stack {
    //     public static boolean isEmpty(){
    //         return head==null;
    //     }

    //     public static void push(int data){
    //         Node newNode=new Node(data);
    //         if(isEmpty()){
    //             head=newNode;
    //             return;
    //         }
    //         newNode.next=head;
    //         head=newNode;
    //     }

    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top=head.data;
    //         head=head.next;
    //         return top;
    //     }

    //     public static int peek(){
    //         return head.data;
    //     }
    // }

    // public static void pushAtBottom(Stack<Integer> s, int data){
    //     if(s.isEmpty()){
    //         s.push(data);
    //         return;
    //     }
    //     int top=s.pop();
    //     pushAtBottom(s, data);
    //     s.push(top);
    // }
    
    // public static void main(String[] args) {
    //     Stack s=new Stack();
    //     s.push(0);
    //     s.push(1);
    //     s.push(2);
    //     s.push(3);
    //     pushAtBottom(s, 4);

    //     while(!s.isEmpty()){
    //         System.out.println(s.peek());
    //         s.pop();
    //     }
    // }

    //reverse a string

    // public static String reverseString(String str){
    //     Stack<Character> s=new Stack<>();
    //     int idx=0;
    //     while(idx<str.length()){
    //         s.push(str.charAt(idx));
    //         idx++;
    //     }
        
    //     String str1="";
    //     while(!s.isEmpty()){
    //         Character curr=s.pop();
    //         str1=str1+curr;
    //     }
    //     return str1;
    // }
    
    // public static void main(String[] args) {
    //     String str="abc";
    //     System.out.println(reverseString(str));

    // }

    //reverse a Stack

    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        if(s.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void main(String args[]){
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // printStack(s);
        reverseStack(s);
        printStack(s);
        
    }
}
