public class powerOfN{
    public static int powerFunction(int x,int n){
        if(n == 0){
            return 1;
        }
        
        return x * powerFunction(x,n-1);
    }

    public static void main(String args[]){
        int x = 2;
        int n = 5;

        int ans = powerFunction(x,n);
        System.out.println(ans);

    }
}