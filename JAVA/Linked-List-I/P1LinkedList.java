public class P1LinkedList{
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

    public void addFirst(int data){
        //create new node
        Node newNode=new Node(data);
        
        if(head==null){
            head=tail=newNode;
            return;
        }
        //newnode next =head
        newNode.next=head;  //link
        //head=newnode
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print(){
        if(head==null){
            System.out.println("LL is null");
            return;
        }
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+ " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        P1LinkedList ll=new P1LinkedList();
        // ll.head=new Node(1);
        // ll.head.next=new Node(2);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}