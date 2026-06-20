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

    // function for adding nodes at first position in linked list
    public void addFirst(int data){
        Node newNode = new Node(data);
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
        if(Head == null){
            Head = newNode;
            Tail = newNode;
            return;
        }
        Tail.next = newNode;
        Tail = newNode;
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
        list.print();
        list.addFirst(1);
        list.print();
        list.addFirst(2);
        list.print();
        list.addLast(3);
        list.print();
        list.addLast(4);
        list.print();
    }
}
