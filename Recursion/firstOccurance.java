public class firstOccurance {

    public static int firstOccurance(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return firstOccurance(arr,key,i+1);


    }
    
    public static void main(String args[]){
        int arr[] = {1,5,8,9,6,4};
        int key = 4;
        int ans = firstOccurance(arr,key,0);
        System.out.println(ans);
    }
}
