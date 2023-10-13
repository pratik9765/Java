public class insertionSort {
    public static void main(String args[]){
        int arr[] = {5,2,8,4,9,6};
        int n = arr.length;

        for(int i=1;i<n;i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev +1] = curr;
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
