import java.util.*;

public class largestNumber {

    public static int getSmallest(int numbers[]){
        int min = Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(min > numbers[i]){
                min = numbers[i]; 
            }
        }

        return min;
    }

    public static int getLargest(int numbers[]){
        int max = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(max < numbers[i]){
                max = numbers[i]; 
            }
        }

        return max;
    }
 

        public static void main(String args[]){
            int numbers[] = {12,4,78,54,34,45};
            
            int largest = getLargest(numbers);
            System.out.println("Largest number is : "+ largest);

            int smallest = getSmallest(numbers);
            System.out.println("Smallest number is : "+ smallest);
        }
}
