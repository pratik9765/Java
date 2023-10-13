import java.util.*;

public class stringCompare {
    public static void main(String args[]){
        String str1 = "Pratik";
        String str2 = "Pratik";

        String str3 = new String("Pratik");

        if(str1 == str2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(str1 == str3){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        System.out.println();
        if(str1.equals(str3)){
            System.out.println("String are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }


    }
}
