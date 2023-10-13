public class continueStatement {
    public static void main(String args[]){
        int i = 1;
        while(i<10){
            i++;
            if(i==3){
                continue;
            }
            
            System.out.println(i);
            
        }


        // for(int i=0;i<10;i++){
        //     if(i==3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }
    }
}
