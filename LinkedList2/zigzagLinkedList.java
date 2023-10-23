import java.util.*;

public class zigzagLinkedList {

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
        

        if(head == null){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        tail.next = newNode;
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

   

    public void zigzagLL(){
        // find mid
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        Node curr = mid.next;
        mid.next = null; 
        Node prev = null;
        Node forward;
        while(curr != null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        Node left = head;
        Node right = prev;

        Node nextR;
        Node nextL;

        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

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
        zigzagLinkedList ll = new zigzagLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.printLinkedList();

        ll.zigzagLL();

        ll.printLinkedList();

    }
}

