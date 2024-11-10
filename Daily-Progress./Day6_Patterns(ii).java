
import java.util.Scanner;


public class Pattern(ii) {

//Right Pascal’s Triangle

  public static void main(String[] args) {
        System.out.print("Enter Number:");
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=n-1; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
  
//print "X" pattern

  public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if( (i==j)|| (i+j)==n+1){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }
    }
// Print "D" pattern
  public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the size for the letter D: ");
        int n = s.nextInt();
        
        // Generate the "D" pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                
                // Left vertical line
                if (j == 1) {
                    System.out.print("*");
                } 
                
                // Top and bottom horizontal lines for the curve of "D"
                else if ((i == 1 || i == n) && j < n - 1) {
                    System.out.print("*");
                }
                
                // Right vertical curve of "D" with a rounded shape
                else if (j == n - 1 && i != 1 && i != n) {
                    System.out.print("*");
                }
                
                // Inside spaces for the "D"
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
  }
}
