import java.util.ArrayList;
import java.util.*;


public class implementation {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // insert operation  O(1)
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.add(1,99);  // O(n) add element at given index and move forward all remaining elements

        System.out.println(list);

        // get operation   ->  O(1)
        // System.out.println(list.get(2));
        // System.out.println(list.get(1));

        // remove/delete operation   O(n)
        // list.remove(2);
        // System.out.println(list);

        // set operation -> O(n) set element at particular index by replacing element present at that place
        // list.set(2, 100);
        // System.out.println(list);

        // contains function -> O(n)
        // System.out.println(list.contains(20));
        // System.out.println(list.contains(200));
    }
}
