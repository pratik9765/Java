public class quickSort {

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int partition(int arr[],int s,int e){
        int pivot = arr[e];
        int i = s-1;  

        for(int j=s;j<e;j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[e] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void quickSort(int arr[],int s,int e){
        if(s>=e){
            return;
        }
        int pivotIndex = partition(arr,s,e);
        quickSort(arr, s, pivotIndex-1);  // left
        quickSort(arr,pivotIndex+1 , e);  // right
    }


    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
