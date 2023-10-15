public class mergeSort {

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge(int arr[],int s,int mid,int e){
        int temp[] = new int[e-s+1];

        int i =s;  // for starting index 
        int j = mid+1;  // for ending index
        int k = 0;  // for temp array

        while(i <= mid && j <= e){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }

        // left part left
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        // right part left
        while(j <= e){
            temp[k++] = arr[j++];
        }

        // copy temp array to original array
        for(k=0, i =s;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }


    public static void mergeSort(int arr[],int s,int e){
        if(s>=e){
            return;
        }

        int mid = s + (e-s)/2;
        mergeSort(arr, s, mid);  //this will solve for left part
        mergeSort(arr, mid+1, e);   //this will solve for right part

        merge(arr,s,mid,e);

    }
    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,-3,8};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
