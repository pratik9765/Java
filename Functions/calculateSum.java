import java.util.*;

public class calculateSum {

    public static int sumCalculator(int a, int b){
        int c = a+b;
        return c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = sumCalculator(a,b);

        System.out.println("Answer is : "+ ans);
    }
}
