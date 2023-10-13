public class binarySearch {

    public static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {1,4,5,12,16,29};

        int target = 57;

        int index = binarySearch(arr,target);
        System.out.println("Element found at index : "+ index);
    }
}
