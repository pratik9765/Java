public class removeParticularChar {
    public static void main(String args[]){
        String str = "Rutik";
        StringBuilder sb = new StringBuilder("");
        for (int i=0;i<str.length();i++){
            if(str.charAt(i) != 'R'){
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb);
    }
}
