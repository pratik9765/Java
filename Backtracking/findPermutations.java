public class findPermutations {

    public static void findPermutations(String str,String ans){
        // base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        // recursion
        for(int i=0;i<str.length();i++){
            char currCh = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            findPermutations(newStr, ans + currCh);
        }

    }
    public static void main(String args[]){
        String str = "abc";
        String ans = "";
        findPermutations(str,ans);
    }   
}
