import java.util.*;

public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of A : ");
        int A = sc.nextInt();
        System.out.print("Enter value of B : ");
        int B = sc.nextInt();
        System.out.print("Enter valid operator : ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' :
                System.out.println(A+B);
                break;
            case '-' :
                System.out.println(A-B);
                break;
            case '*' :
                System.out.println(A*B);
                break;
            case '/' :
                System.out.println(A/B);
                break;
            case '%' :
                System.out.println(A%B);
                break;
            default:
                System.out.print("Not a valid Operator");
        }
    }
}
