public class checkSortedArray {

    public static boolean checkSorted(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return checkSorted(arr, i+1);
    }


    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        boolean ans = checkSorted(arr,0);
        System.out.println(ans);
    }
}
