import java.util.*;

public class checkPrimeOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n/2;
        int flag = 0;

        while(i >= 2 ){
            if(n % i == 0){
                flag = 1;
            }
            i--;
        }

        if(flag == 0){
            System.out.println("Given number is Prime");
        }
        else{
            System.out.println("Given number is not a  Prime number");
        }
    }
}
