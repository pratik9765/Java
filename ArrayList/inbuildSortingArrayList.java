import java.util.ArrayList;
import java.util.Collections;

public class inbuildSortingArrayList {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(2);
        arr.add(9);
        arr.add(4);

        Collections.sort(arr);  //sort in ascending order

        System.out.println(arr);
        
                            //  || comparator ||
        Collections.sort(arr,Collections.reverseOrder());  //descending  order
        System.out.println(arr);

    }
}
