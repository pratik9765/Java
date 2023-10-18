public class LinkedList {

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

    public void addAtIndex(int data,int index){
        Node newNode = new Node(data);
        Node temp =head;
        // int n = findSize(head);
        int i= 0;

        if(index == 0){
            addFirst(data);
            return;
        }
        else if(index == size){
            addLast(data);
            return;
        }
        else if(index > size){
            System.out.println("Index is out of bounds");
            return;
        }
        else{
            while(i < index - 1){
                temp = temp.next;
                i++;
            }           
        }

        size++;
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removefirst(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public void printLinkedList(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        return;
    }

    // public static int findSize(Node head){
    //     int len = 0;
    //     Node temp = head;
    //     while(temp != null){
    //         len++;
    //         temp = temp.next;
    //     }

    //     return len;
    // }

    public static void main(String args[]){
        LinkedList  ll = new LinkedList();
        ll.addFirst(2); 
        ll.addFirst(1);
        ll.addLast(3); 
        ll.addLast(4); 
        ll.addAtIndex(9, 2);

        ll.printLinkedList(head);
        // System.out.println(findSize(head));
        System.out.println(size);

        ll.removefirst();
        ll.printLinkedList(head);
    }    
}
