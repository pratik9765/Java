public class arrayPassInFunction {
    public static void updateMarks(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i] + 5;
        }
    }
    public static void main(String args[]){
        int marks[] = {50,60,70};

        updateMarks(marks);

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }
    }    
}
