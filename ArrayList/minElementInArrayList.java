import java.util.ArrayList;

public class minElementInArrayList {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(40);
        arr.add(80);
        arr.add(60);
        arr.add(10);
        arr.add(30);

        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.size();i++){
            if(min > arr.get(i)){
                min = arr.get(i);
            }
        }

        System.out.println(min);
    }
}
