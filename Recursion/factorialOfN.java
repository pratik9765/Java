public class factorialOfN {

    public static int factorial(int n){
        int fact;
        if(n == 1){
            return 1;
        }
        return fact =  n * factorial(n-1);
        
    }
    public static void main(String args[]){
        int n = 3;
        int ans = factorial(n);
        System.out.println(ans);
    }
}
