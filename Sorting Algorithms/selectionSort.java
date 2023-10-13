public class selectionSort {

    public static void selectionSort(int arr[]){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int indexOfMin = i;
            for(int j=i+1;j<n;j++){
                if(arr[indexOfMin] > arr[j]){
                    indexOfMin = j;
                }
            }

            int temp= arr[indexOfMin];
            arr[indexOfMin] = arr[i];
            arr[i] = temp;
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]){
        int arr[] = {2,1,4,3,9,8,6};

        selectionSort(arr);

    }
}
