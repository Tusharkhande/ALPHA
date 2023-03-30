public class LinkedList{
    
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size=0;

    public static void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public static void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public static void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public static void removeFirst(){
        if(size==0){
            System.out.println("LL is Empty");
            return;
        }
        if(size==1){
            head=tail=null;
            size--;
        }
        head=head.next;
        size--;
    }

    public static void removeLast(){
        if(size==0){
            System.out.println("LL is Empty");
            return;
        }
        if(size==1){
            head=tail=null;
            size--;
        }
        Node prev=head;
        for(int i=1;i<size-1;i++){
            prev=prev.next;
        }
        prev.next=null;
        tail=prev;
        size--;
    }

    

    public static void print(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.add(0,4);
        ll.addLast(0);
        ll.removeFirst();
        ll.removeLast();
        ll.print();
        System.out.println(size);
    }
}