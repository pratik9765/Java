public class removeCyclePresentInLinkedList {

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

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;

    }


    public static void printLinkedList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        return;
    }


    public static void removeCycle(){
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }

        if(cycle == false){
            return;
        }
        
        // findmeeting point
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            fast = fast.next;
            slow = slow.next;
        }

        // remove-cycle
        prev.next = null; 

    }



    public static void main(String args[]){
      
        findLoopInLinkedList  ll = new findLoopInLinkedList();
        // ll.addFirst(2); 
        // ll.addFirst(1);
        // ll.addLast(3); 
        // ll.addLast(4);

        // ll.printLinkedList();

        // reverse();
        // ll.printLinkedList();

        // System.out.println(ll.isCycle());

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;


        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}

