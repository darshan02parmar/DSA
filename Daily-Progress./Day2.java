import java.util.Scanner;

class Day2 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

    /* Question 1: In a program,input 3numbers:A,B and C.
		You have to output the average of these 3 numbers */
		
		System.out.println("Enter Three Numbers: ");
     		   int a=s.nextInt();
     		   int b=s.nextInt();
     		   int c=s.nextInt();
      		  int avg=(a+b+c)/3;
      		  System.out.println(avg);
		
		/* 
		Question 2: In a program,input the side of a square,,	You have to output the area of the square. 
		*/
		
		System.out.println("Enter Side of square: ");		
		int a = sc.nextInt();
		System.out.println("Area of square= " + a*a);
		
	/* 
	Question 3: Enter cost of 3 items from the user(float)-
	a pencil, a pen and an eraser. 
	You have to output the total cost of the items back to the user as their bill..
	Add 18% gst tax	to bill	
		*/
    System.out.println("Enter cost of 3 items: ");
		float pen=s.nextFloat();
    float eraser=s.nextFloat();
    float pencil=s.nextFloat();
 
    float total=pen+pencil+eraser;
    System.out.println("total: "+total);
       
    double gst=total+(0.18f*total);
    System.out.println("Total bill with gst: "+gst);
    
		sc.close();
	}
}
