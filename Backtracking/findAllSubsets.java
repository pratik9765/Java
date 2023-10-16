public class findAllSubsets {
    public static void findAllSubsets(String str,String ans,int i){
        // base case
        if(i == str.length()){
            System.out.println(ans);

            return;
        }
        

        // recursion
        // dont add to substring
        findAllSubsets(str,ans,i+1);

        // add to substring
        findAllSubsets(str,ans+ str.charAt(i),i+1);

        
    }
    public static void main(String args[]){
        String str = "abc";
        String ans = "";
        findAllSubsets(str,ans,0);
    }
}
