public class subString {
    public static String substring(String str,int si,int ei){
        String str1 = "";
        for(int i=si;i<ei;i++){
            str1 += str.charAt(i);
        }
        return str1;
    }

    public static void main(String args[]){
        String str = "HelloWorld";
        String ans = substring(str,0,4);
        System.out.println(ans);

        String sub = str.substring(0, 7);
        System.out.println(sub);

    }
}
