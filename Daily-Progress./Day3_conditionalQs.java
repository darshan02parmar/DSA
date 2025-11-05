
import java.util.Scanner;

public class conditionalQs {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

      //Question 1 : Check entered no. is postive or negative
     
      int a=s.nextInt();
        if(a>0){
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }
// largest of three number
		System.out.println("Enter a number A");
        int a=s.nextInt();
        System.out.println("Enter a number B");
        int b=s.nextInt();
        System.out.println("Enter a number C");
        int c=s.nextInt();
        if (a>b & a>c){
            System.out.println("A is largest number");
        }else if (b>c){
            System.out.println("B is largest number");
        }else {
            System.out.println("C is largest number");
		}
  //Question 2 : Check the fever upon temperature input

     double temp=103.5;    
        if(temp>100){
            System.out.println("fever");
        }
        else{
            System.out.println("not fever");
        }
   //Question 3 : Input (1-7) and print day of week using 'switch'

      int n=s.nextInt();

       switch(n){

        case 1:{
            System.out.println("Sunday");
            break;
        }
        case 2:{
            System.out.println("Monday");
            break;
        }case 3:{
            System.out.println("tuesday");
            break;
        }case 4:{
            System.out.println("Wednesday");
            break;
        }case 5:{
            System.out.println("thursday");
            break;
        }case 6:{
            System.out.println("friday");
            break;
        }case 7:{
            System.out.println("saturday");
            break;
        }
        default:System.out.println("enter between 1-7");
       }
//Question 4: Check entered year is leap or not
             int year=s.nextInt();

                if (year % 4 != 0) {
                    System.out.println("Not a leap year");
                } else if (year % 100 != 0) {
                    System.out.println("Leap year");
                } else if (year % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not a leap year");
                }
  sc.close();
	}
}    
  
