public class removeDuplicatesInString {

    public static void removeDuplicates(String str, int i,StringBuilder sb,boolean map[]){
        if(i == str.length()){
            System.out.println(sb);
            return;
        }

        char currChar = str.charAt(i);

        if(map[currChar - 'a'] == true){
            // duplicate
            removeDuplicates(str,i+1,sb,map);
        }
        else{
            map[currChar - 'a'] = true;
            removeDuplicates(str,i+1,sb.append(currChar),map);
        }
    }
    
    public static void main(String args[]){
        String str = "aapnacollege";
        int i = 0; 
        StringBuilder sb = new StringBuilder("");
        boolean map[] = new boolean[26];
        removeDuplicates(str,0,sb,map);
    }
}
