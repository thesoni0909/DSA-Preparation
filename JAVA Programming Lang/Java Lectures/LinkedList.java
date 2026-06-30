// Linked List (Part 01)

public class LinkedList {

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

    // function for adding nodes at specific position of a linkedlist
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

    // Reverse a linked list

    // method 01 :
    public void ReverseLL(){
        if(size==0){
            System.out.println("Linked List is empty , can't be reversed!");
            return;
        }
        if(size==1){
            print();
            System.out.println("Reverse of linkedlist is original linkedlist itself!");
            return;
        }
        Node prev = Head;
        Node curr = prev.next;
        Node front;
        Head = Tail;
        Tail = prev;
        Tail.next = null;
        while(curr!=null){
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        print();
    }

    // method 02 : standard
    public void ReverseLL2(){
        Node prev = null;
        Node curr = Tail = Head; //java evaluates assignment operator from right to left
        Node front;
        while(curr!=null){
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        Head = prev;
        print();
    }

    // find and remove nth node from end
    public void removeNth(int n){
        int reqSize = size-n;
        if(reqSize==0){
            if(size==1){
                Tail = null;
                Head = null;
            }
            else{
                Head = Head.next;
            }
            size--;
            return;
        }
        Node prev = Head;
        for(int i=0; i<reqSize-1; i++){
            prev = prev.next;
        }
        if(reqSize==size-1){
            Tail = prev;
            prev.next = null;
            size--;
            return;
        }
        Node curr = prev.next;
        prev.next = curr.next;
        size--;
    }

    // finding mid Node of Linked List(slow and fast pointer approach)
    public Node midNode(){
        Node slow = Head;
        Node fast = Head;
        while((fast!=null) && (fast.next!=null)){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // check if LL is palindrome or not
    public boolean checkPalindrome(){
        if(Head == null || Head.next == null){
            return true;
        }
        Node midNode = midNode();
        Node prev = null;
        Node curr = midNode;
        Node front;
        while(curr!=null){
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        Node left = Head;
        Node right = prev;
        while (right!=null) {
            if(left.data == right.data){
                left = left.next;
                right = right.next;
            }
            else{
                return false;
            }
        }
        return true;
    }

    // function for detecting a cycle in LL
    public boolean detectCycle(){
        Node slow = Head;
        Node fast = Head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
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
        LinkedList list = new LinkedList();
        // list.print();
        // list.addFirst(1);
        // list.print();
        // list.addFirst(2);
        // list.print();
        // list.addLast(3);
        // list.print();
        // list.addLast(4);
        // list.print();

        // list.addLast(1);
        // list.addLast(5);
        // list.addLast(2);
        // list.addLast(9);
        // list.addMiddle(5, 6);
        // list.addLast(10);
        // list.addLast(11);
        // list.addLast(12);
        // list.addLast(13);
        // list.print();
        // System.out.println("Size of Linked List : "+LinkedList.size);

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
        // int val3 = list.Rsearch2(5, Head);
        // if(val3==-1){
        //     System.out.println("key is not present in LL!");
        // }
        // else{
        //     System.out.println("key is present at "+val3+" index");
        // }

        // Reverse LL
        // list.ReverseLL();
        // list.ReverseLL2();

        // remove nth node from end
        // list.removeNth(1);
        // list.print();
        // System.out.println("Size of Linked List : "+LinkedList1.size);

        // finding mid Node
        // Node midNode = list.midNode();
        // System.out.println(midNode.data);

        // check if LL is palindrome or not
        // System.out.println(list.checkPalindrome());

        // detect a cycle in LL
        Head = new Node(1);
        Head.next = new Node(2);
        Head.next.next = new Node(3);
        Head.next.next.next = new Node(4);
        Head.next.next.next.next = Head.next.next;
        if(list.detectCycle()){
            System.out.println("Cycle exists!");
        }
        else{
            System.out.println("Cycle does not exists!");
        }
    }
}
