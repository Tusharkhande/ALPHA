public class P2LinkedList {
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

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addlast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        
        while(i< idx-1){
            temp=temp.next;
            i++;
        }

        //i=idx-1   
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }

        //prev: i=size-2
        Node prev=head;
        // int i=0;
        // while(i<size-2){
        //     prev=prev.next;
        //     i++;
        // }

        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data; //tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        P2LinkedList ll=new P2LinkedList();

        //ll.print();
        ll.addFirst(2);
        //ll.print();
        ll.addFirst(1);
        //ll.print();
        ll.addlast(4);
        //ll.print();
        ll.addlast(5);
        //ll.print();
        ll.add(2, 3);
        //ll.print();
        ll.add(0, 0);
        ll.print();

        System.out.println("Size of LL is: "+ size);

        ll.removeFirst();
        ll.print();
        System.out.println("Size of LL after removing first... "+size);

        ll.removeLast();
        ll.print();
    }
}
