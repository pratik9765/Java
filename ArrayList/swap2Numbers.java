import java.util.ArrayList;

public class swap2Numbers {
    public static void swapElementAtIndex(int i,int j,ArrayList<Integer>list){
        int temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        
        System.out.println(list);
        
        swapElementAtIndex(1,3,list);

        System.out.println(list);

    }
}
