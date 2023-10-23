public class doublyLinkedList {
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

    public void removeFirst(){
        if(head == null){
            System.out.println("No elements in the list");
            return;
        }

        if(size == 1){
            head = tail =null;
            size--;
            return;
        }

        head = head.next;
        head.prev = null;
        size--;
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
        doublyLinkedList dll = new doublyLinkedList();

        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);

        dll.print();
        System.out.println(size);
        
        dll.removeFirst();
        
        dll.print();
        System.out.println(size);


    }
}
