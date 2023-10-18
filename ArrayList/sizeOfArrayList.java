import java.util.ArrayList;

public class sizeOfArrayList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
