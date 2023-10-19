import java.util.LinkedList;

public class reverseLinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        // step 1 -> create new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        // step 2
        newNode.next = head;

        // step 3
        head = newNode;
    }

    public void addLast(int data){
        // step 1
        Node newNode = new Node(data);
        size++;

        // step 2
        if(head == null){
            addFirst(data);
        }

        // step 3
        tail.next = newNode;

        // step 4
        tail = newNode;
    }

    public static void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node forward;

        while(curr != null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        head = prev;
    }

    public void printLinkedList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        return;
    }

    public static void main(String args[]){
      
        reverseLinkedList  ll = new reverseLinkedList();
        ll.addFirst(2); 
        ll.addFirst(1);
        ll.addLast(3); 
        ll.addLast(4);

        ll.printLinkedList();

        reverse();
        ll.printLinkedList();
    }


}
