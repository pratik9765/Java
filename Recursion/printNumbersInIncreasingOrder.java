public class printNumbersInIncreasingOrder {

    public static void printIncreasingOrder(int n){
        if(n == 10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printIncreasingOrder(n+1);

    }
    public static void main(String args[]){
        int n = 1;
        printIncreasingOrder(n);
    }
}
