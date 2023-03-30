    
public class P5DeleteNthFromEnd{
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

    public void deleteNthFromEnd(int n){
        Node temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }

        if(n==size){
            head=head.next; //removefirst
            return;
        }
        
        Node prev=head;
        int i=1;
        int iToFind=size-n;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }

        prev.next=prev.next.next;
        return;
    }

    // public void delete(int idx){
    //     Node temp=head;
    //     int i=0;
    //     while(i<idx-1){
    //         temp=temp.next;
    //         i++;
    //     }
    //     temp.next=temp.next.next;
    //     return;
    // }

    public static void main(String[] args) {
        P5DeleteNthFromEnd ll=new P5DeleteNthFromEnd();
        
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.print();
        ll.deleteNthFromEnd(3);
        // ll.delete(1);
        ll.print();
    }
}