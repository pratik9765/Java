public class reverseOfNumber {
    public static void main(String args[]){
        // int num = 10899;
        // String ans = "";

        // while(num > 0){
        //     int digit = num%10;
        //     System.out.print(digit);
        //     num = num/10;
        //     ans+=digit;
        // }

        // System.out.println("\n");
        // System.out.println(ans);



        int num =  2345;
        int reverse = 0;

        while(num>0){
            int lastDigit = num%10;
            reverse = reverse*10 + lastDigit;
            num = num/10;
        }

        System.out.println(reverse);
    }
}
 