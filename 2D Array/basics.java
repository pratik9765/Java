import java.util.*;


public class basics {

    public static boolean search(int matrix[][], int target){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == target){
                    System.out.print("Target found value at "+ "[" + i + "]" + "[" + j + "]");
                    return true;
                }
            }
        }

        return false;
    }  


    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = 3;
        int m= 3;

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("Enter value at "+ "[" + i + "]" + "[" + j + "] : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int target = 9;
        boolean ans = search(matrix,target);

        System.out.println(ans);
    }
}
