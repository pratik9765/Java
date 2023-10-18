import java.util.ArrayList;

public class maxElementInArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(50);
        list.add(40);
        list.add(80);
        list.add(30);

        int max = Integer.MIN_VALUE;

        for(int i=0;i<list.size();i++){
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }

        System.out.println(max);
    }
}
