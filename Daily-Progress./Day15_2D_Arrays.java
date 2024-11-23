import java.util.Scanner;

public class Creation {

  //for search 
    public static boolean search(int matrix[][],int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==key){
                    System.out.println("Found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
      // Creation of 2D arrays
        int matrix[][]=new int[3][3];
        int n= matrix.length;
        int m=matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter Values: ");
                Scanner s=new Scanner(System.in);
                matrix[i][j]=s.nextInt();
            }
        }
        //print
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,5);
    }
}

