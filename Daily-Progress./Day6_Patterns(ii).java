
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
  
}
