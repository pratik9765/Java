import java.util.*;

public class basics{

    public static void print(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // char arr[] = {'a','b','c','d','e','f'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // Strings are immutable

        // System.out.println(str);
        // System.out.println(str2);

        // String name;
        // System.out.print("Enter Name : ");
        // name = sc.nextLine();
        // System.out.println(name.length());

        // int arr2[] = {1,2,3,4,5};
        // System.out.println(arr2.length);
        
        String str1 = "Pratik";
        String str2 = "Bokde";
        String fullName = str1 + " " + str2;

        System.out.println(fullName.charAt(2));

        print(fullName);


    }
}