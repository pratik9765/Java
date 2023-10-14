public class sumOfNaturalNumbers {

    public static int sumNatural(int n){
        int sum;
        if(n == 1){
            return 1;
        }
        sum = n + sumNatural(n-1);

        return sum;
    }
    public static void main(String args[]){
        int n = 3;
        int ans = sumNatural(n);
        System.out.println(ans);
    }
}
