public class P4ReverseLL{
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
            return;
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

    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

    }

    public static void main(String[] args) {
        P4ReverseLL ll=new P4ReverseLL();
        
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.print();
        ll.reverse();
        ll.print();
    }
}