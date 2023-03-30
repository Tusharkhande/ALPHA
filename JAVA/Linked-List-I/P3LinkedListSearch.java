public class P3LinkedListSearch {
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
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
        size++;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        tail=newNode;
        size++;
    }

    public void print(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }else {
                temp=temp.next;
                i++;
            }
        }
        //key not found 
        return -1;
    }

    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }

        return idx+1;
    }

    public int recursiveSearch(int key){
        return helper(head,key);
    }

    public static void main(String args[]){
        P3LinkedListSearch ll=new P3LinkedListSearch();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(9);
        ll.addLast(4);
        ll.addFirst(0);

        ll.print();

        // int index=ll.itrSearch(9);
        // if(index==-1){
        //     System.out.println("Key Not Found");
        // }else{
        //     System.out.println("Key found at index: "+index);
        // }

        System.out.println(ll.itrSearch(9));
        System.out.println(ll.itrSearch(10));

        System.out.println(ll.recursiveSearch(9));
    }
}
