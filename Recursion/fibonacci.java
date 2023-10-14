public class fibonacci{

    public static int printFibonacci(int n){
        int num;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        num = printFibonacci(n-1) + printFibonacci(n-2);

        return num;

    }
    public static void main(String args[]){
        int n = 25;
        int ans = printFibonacci(n);
        System.out.println(ans);
    }
}