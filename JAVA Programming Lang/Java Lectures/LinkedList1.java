// Linked List (Part 01)

public class LinkedList1 {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node Head;
    public static Node Tail;
    public static int size;

    // function for adding nodes at first position in linked list
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(Head == null){
            Head = newNode;
            Tail = newNode;
            return;
        }
        newNode.next = Head;
        Head = newNode;
    }

    // function for adding nodes at last position in linked list
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(Head == null){
            Head = newNode;
            Tail = newNode;
            return;
        }
        Tail.next = newNode;
        Tail = newNode;
    }

    // function for adding nodes in middle of a linkedlist
    public void addMiddle(int index, int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = Head;
        for(int i=0; i!=index-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // function for removing first node in linkedlist
    public int removeFirst(){
        if(size==0){
            return 0;
        }else if(size==1){
            int data = Head.data;
            Head = Head.next;
            Tail = Tail.next;
            size--;
            return data;
        }
        int data = Head.data;
        Head=Head.next;
        size--;
        return data;
    }

    // function for removing last node in linkedlist
    public int removeLast(){
        if(size==0){
            return 0;
        }else if(size==1){
            int data = Tail.data;
            Head=Tail=null;
            size--;
            return data;
        }
        Node Prev = Head;
        for(int i=1; i!=size-1; i++){
            Prev = Prev.next;
        }
        int data = Tail.data;
        Prev.next=null;
        Tail=Prev;
        size--;
        return data;
    }

    // Iterative Search : Search a key in LL
    public int Search(int Key){
        Node Temp = Head;
        for(int i=0; i<=size-1; i++){
            if(Key==Temp.data){
                return i;
            }
            Temp=Temp.next;
        }
        return -1;
    }

    // Recursive Search : Search for a key in LL
    public int Rsearch(int key, Node temp, int index){
        if(temp==null){
            return -1;
        }
        if(temp.data==key){
            return index;
        }
        int position = Rsearch(key, temp.next, index+1);
        return position;
    }

    // Recursive Search : Second method
    public int Rsearch2(int key, Node temp){
        if(temp==null){
            return -1;
        }
        if(temp.data==key){
            return 0;
        }
        int idx = Rsearch2(key, temp.next);
        if(idx==-1){
            return -1;
        }
        else{
            return idx+1;
        }
    }

    // function for printing the nodes of linked list
    public void print(){
        Node temp = Head;
        if(Head == null){
            System.out.print("Linked List is empty!"+"\n");
            return;
        }
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" null");
    }

    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        // list.print();
        // list.addFirst(1);
        // list.print();
        // list.addFirst(2);
        // list.print();
        // list.addLast(3);
        // list.print();
        // list.addLast(4);
        // list.print();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addMiddle(2, 9);
        list.addLast(10);
        list.print();
        System.out.println("Size of Linked List : "+LinkedList1.size);

        // int val=list.removeFirst();
        // if(val==0){
        //     System.out.println("Linked List is empty! Hence there is no data present in linked list.");
        // }
        // else{
        //     System.out.println("The data present in the first node was : "+val);
        // }
        // list.print();

        // System.out.println("The data present in the Last node was : "+list.removeLast());
        // System.out.println("Size of Linked List : "+LinkedList1.size);
        // list.print();

        // Iterative Search : Search for a key in LL
        // int val1=list.Search(10);
        // if(val1==-1){
        //     System.out.println("Key is not present in LL!");
        // }
        // else{
        //     System.out.println("Key is present at "+val1+" index.");
        // }

        // Recursive Search : Search for a key in LL
        // int val2 = list.Rsearch(10,Head,0);
        // if(val2==-1){
        //     System.out.println("Key is not present in LL!");
        // }
        // else{
        //     System.out.println("Key is present at "+val2+" index");
        // }

        // Recursive Search method 2
        int val3 = list.Rsearch2(5, Head);
        if(val3==-1){
            System.out.println("key is not present in LL!");
        }
        else{
            System.out.println("key is present at "+val3+" index");
        }
    }
}
