import java.util.*;

public class evenOdd {
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        num = sc.nextInt();

        if(num%2==0){
            System.out.println("Given number is Even");
        }
        else{
            System.out.println("Given number is Odd");
        }
    }
}
