public class linearSearch {
    public static void main(String args[]){
        int arr[] = {10, 20, 30, 40, 50}; // this is the array

        int target = 10;

        for(int i=0;i<arr.length;i++){
           if (target == arr[i]){
                System.out.println("Target found at position : "+i);
                return;
           }
        }
        System.out.println("Target is not found.");

    }
}
