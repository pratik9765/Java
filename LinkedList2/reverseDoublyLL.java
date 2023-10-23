public class reverseDoublyLL {
    public class Node{
        int data;
        Node next, prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node forward = null;

        while(curr != null){
            forward = curr.next;
            curr.next = prev;
            curr.prev = forward;

            prev = curr;
            curr = forward;
        }

        head = prev;
    }

   

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String args[]){
        reverseDoublyLL dll = new reverseDoublyLL();

        // dll.addFirst(5);
        // dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();

        dll.reverse();

        dll.print();


    }
}
