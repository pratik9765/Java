public class searchInRotatedSortedArray {
    public static int searchInRSA(int arr[],int target,int s,int e){
        if(s > e){
            return -1;
        }

        int mid = s + (e-s)/2;

        if(arr[mid] == target){
            return mid;
        }

        // target lie on L1
        if(arr[s] <= arr[mid]){
            if(arr[s] <= target && target <= arr[mid]){
                return searchInRSA(arr, target, s, mid-1);
            }
            else{
                return searchInRSA(arr, target, mid+1, e);
            }
        }
        // target lies on L2
        else{
            if(arr[mid] <= target && target <= arr[e]){
                return searchInRSA(arr, target, mid+1, e);
            }
            else{
                return searchInRSA(arr, target, s, mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 6;
        
        int index = searchInRSA(arr,target,0,arr.length-1);
        System.out.println(index);
    }
}
