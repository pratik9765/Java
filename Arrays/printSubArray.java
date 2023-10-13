public class printSubArray {

    public static void printAllSubArray(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                currSum = 0;
                for(int k = i;k<=j;k++){
                    currSum += numbers[k]; 
                }
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Maximum sub array sum is : "+ maxSum);
    }


    public static void main(String args[]){
        int numbers[] = {1,2,3,6,-3};
        
        printAllSubArray(numbers);
    }
}
