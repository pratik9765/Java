import java.util.*;

public class inputInJava {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        String input = sc.nextLine();
        System.out.println(input);

        System.out.println("Enter any Number : ");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        System.out.println(num);

        System.out.println("Enter any float : ");
        float a = scn.nextFloat();
        System.out.println(a);
    }
}
