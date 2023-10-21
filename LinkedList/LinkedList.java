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

    public int removeLast(){
        if(size == 0){
            System.out.println("LinkedList in empty.");
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int index = helper(head.next,key);
        if( index == -1){
            return -1;
        }

        return index+1;
    }


    public int recursiveSearch(int key){
        return(helper(head,key));
    }

    public void reverseLinkedList(){
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

    public void deleteNthFromEnd(int n){
        if(n == size){
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while(i < iToFind){
            prev =  prev.next;
            i++;
        }

        prev.next = prev.next.next;
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

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;  // middle Node
    }

    public boolean isPalindrome(){
        if(head == null && head.next == null){
            return true;
        }

        // step 1 -> find mid
        Node midNode = findMid(head);

        // step 2 => reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node forward;

        while(curr != null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        Node right = prev;
        Node left = head;

        // check left half and right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
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
        // ll.addFirst(2); 
        // ll.addFirst(1);
        // ll.addLast(3); 
        // ll.addLast(4); 
        // ll.addAtIndex(9, 2);

        // ll.printLinkedList();
        // // System.out.println(findSize(head));
        // System.out.println(size);

        // ll.removefirst();
        // ll.printLinkedList();

        // ll.removeLast();
        // ll.printLinkedList();
        // System.out.println(size);

        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(30));

        // System.out.println(ll.recursiveSearch(3));
        // System.out.println(ll.recursiveSearch(30));

        // ll.reverseLinkedList();
        // ll.printLinkedList();

        // ll.deleteNthFromEnd(2);
        // ll.printLinkedList();

        // ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);

        System.out.println(ll.isPalindrome());
    }    
}
